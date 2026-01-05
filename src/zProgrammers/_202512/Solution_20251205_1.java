package zProgrammers._202512;

import java.util.ArrayList;
import java.util.List;

class Solution_20251205_1 {
    public List<Integer> solution(int l, int r) {
        List<Integer> answers = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            String s = String.valueOf(i);

            if(s.length() == 1) {
                if(s.indexOf("5") == 0) {
                    answers.add(i);
                }
            } else {
                if(s.indexOf("1") == -1 && s.indexOf("2") == -1 && s.indexOf("3") == -1 && s.indexOf("4") == -1 && s.indexOf("6") == -1 && s.indexOf("7") == -1 && s.indexOf("8") == -1 && s.indexOf("9") == -1) {
                    answers.add(i);
                }
            }
        }


        if(answers.size() == 0) {
            answers.add(-1);
        }

        return answers;
    }

    public static void main(String[] args) {
        Solution_20251205_1 s = new Solution_20251205_1();
        s.solution(5 , 555);
    }
}