import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;


public class DailyMain {
    public static void main(String[] args) throws IOException {
        int wantCnt = 2;
        ArrayList<Integer> wantsArr = new ArrayList<>();

        JsonNode node = new ObjectMapper().readTree(new File("src/questions.json").getAbsoluteFile());
        Random random = new Random();

        while(wantsArr.size() < wantCnt) {
            int key = random.nextInt(node.size());
            if(!wantsArr.contains(key)) {
                wantsArr.add(key);
            }
            if(wantsArr.size() >= node.size()) {
                break;
            }
        }

        for(Integer i : wantsArr) {
            System.out.println();
            System.out.println(node.get(i).toPrettyString());
        }
    }
}
