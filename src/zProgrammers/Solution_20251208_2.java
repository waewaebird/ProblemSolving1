package zProgrammers;

class Solution_20251208_2 {
    public String solution(String my_string, int s, int e) {
        char[] answers = new char[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            if(i >= s && i <= e) {
                answers[(s+e) - i] = my_string.charAt(i);
            } else {
                answers[i] = my_string.charAt(i);
            }
        }

        String answer = "";
        for(char x : answers) {
            answer += x;
        }

        return answer;
    }
}