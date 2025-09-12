import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class DailyMain {
    static Map<String, String> subjectKeyMap = new HashMap<>(){{
        put("s", "String");
        put("a", "Array");
        put("ts", "TwoPointersSlidingWindow");
        put("ht", "HashMapTreeSet");
        put("sq", "StackQueue");
        put("ss", "SortingAndSearching");
        put("rt", "RecursiveTreeGraph");
        put("db", "DfsBfs");
        put("ga", "GreedyAlgorithm");
        put("dp", "DynamicProgramming");
    }};

    public static void main(String[] args) throws IOException {
        Float ratio = Float.MAX_VALUE;
        String lowKey = "";

        for(Map.Entry<String, String> entry : subjectKeyMap.entrySet()) {
            String key = entry.getKey();
            String val = entry.getValue();

            File mainPackage = new File("src/" + val);
            int mainCnt = 0;
            if(mainPackage.exists() && mainPackage.isDirectory()) {
                mainCnt = mainPackage.listFiles((dir, name) -> name.endsWith(".java")).length;
            }

            File revPackage = new File("src/" + val + "/rev");
            int revCnt = 0;
            if(revPackage.exists() && revPackage.isDirectory()) {
                revCnt = revPackage.listFiles((dir, name) -> name.endsWith(".java")).length;
            }

            Float temp = (float) revCnt / mainCnt;

            if(temp < ratio) {
                ratio = temp;
                lowKey = key;
            }
        }

        int wantCnt = 4;
        List<Integer> wantsArr = new ArrayList<>();
        JsonNode node = new ObjectMapper().readTree(new File("src/questions.json").getAbsoluteFile());
        Random random = new Random();
        while(wantsArr.size() < wantCnt) {
            int key = random.nextInt(node.size());

            if(!wantsArr.contains(key)) {
                if(wantsArr.size() == 0) {
                    String subject = node.get(key).get("number").toString().split(" ")[0].replace("\"","");
                    if(!subject.equals(lowKey)) {
                        continue;
                    }
                }

                if(wantsArr.size() == wantCnt-1) {
                    String subject = node.get(key).get("number").toString().split(" ")[0].replace("\"","");
                    if(!subject.equals("ga")) {
                        continue;
                    }
                }
                wantsArr.add(key);
            }
        }

        for(Integer i : wantsArr) {
            JsonNode result = node.get(i);

            try (FileWriter fileWriter = new FileWriter("src/record.txt", true)){
                fileWriter.write(result.findValuesAsText("number").get(0) + System.lineSeparator());
            } catch (IOException e) {
                System.out.println(e);
            }

            ((ObjectNode) result).remove("number");
            System.out.println(result.toPrettyString() + System.lineSeparator());

        }
    }
}
