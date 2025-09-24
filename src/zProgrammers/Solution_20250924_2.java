package zProgrammers;

import java.util.Arrays;

class Solution_20250924_2 {
    public String solution(String s) {
        String[] temp = s.split(" ");

        int[] answers = new int[temp.length];
        int i = 0;
        for(String ss : temp) {
            answers[i] = Integer.valueOf(ss);
            i++;
        }

        Arrays.sort(answers);
        String answer = answers[0] + " " + answers[answers.length-1];

        return answer;
    }
}