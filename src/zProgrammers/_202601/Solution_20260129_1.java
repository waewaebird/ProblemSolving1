package zProgrammers._202601;

class Solution_20260129_1 {
    public String solution(String myString) {
        String answer = "";

        for(char x : myString.toCharArray()) {
            if(x == 'a' || x == 'A') {
                answer += Character.toUpperCase(x);
            } else {
                answer += Character.toLowerCase(x);
            }
        }

        return answer;
    }
}