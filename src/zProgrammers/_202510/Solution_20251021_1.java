package zProgrammers._202510;

import java.util.ArrayList;
import java.util.List;

class Solution_20251021_1 {
    public String[] solution(String[] names) {
        List<String> answers = new ArrayList<>();

        int cnt = 0;
        String[] temps = new String[5];
        for (int i = 0; i < names.length; i++) {
            temps[cnt] = names[i];
            cnt++;

            if(cnt == 5) {
                answers.add(temps[0]);
                cnt = 0;
            }
        }

        if(cnt > 0 && cnt < 5) {
            answers.add(temps[0]);
        }

        return answers.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Solution_20251021_1 s= new Solution_20251021_1();
        String[] result = s.solution(new String[] {"nami", "ahri", "jayce", "garen", "ivern"});
        for(String x : result) {
            System.out.print(x + " ");
        }


    }
}