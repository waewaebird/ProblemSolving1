import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class DailyMain {
    public static void considerCnt(String number) {

    }

    public static void main(String[] args) throws IOException {
        int wantCnt = 3;
        List<Integer> wantsArr = new ArrayList<>();
        JsonNode node = new ObjectMapper().readTree(new File("src/questions.json").getAbsoluteFile());
        Random random = new Random();
        while(wantsArr.size() < wantCnt) {
            int key = random.nextInt(node.size());

            if(!wantsArr.contains(key)) {
                if(wantsArr.size() == wantCnt-1) {
                    String subject = node.get(key).get("number").toString().split(" ")[0].replace("\"","");
                    if(!subject.equals("db")) {
                        continue;
                    }
                }
                wantsArr.add(key);
            }
        }

        for(Integer i : wantsArr) {
            JsonNode result = node.get(i);
            considerCnt(result.get("number").toString());

            System.out.println(result.toPrettyString() + System.lineSeparator());
            try (FileWriter fileWriter = new FileWriter("src/record.txt", true)){
                fileWriter.write(result.findValuesAsText("number").get(0) + System.lineSeparator());
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
