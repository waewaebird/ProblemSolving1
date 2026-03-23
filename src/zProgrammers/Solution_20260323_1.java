package zProgrammers;

class Solution_20260323_1 {
    public String solution(String my_string, String alp) {
        String answer = "";

        for(char x : my_string.toCharArray()) {
            if(x == alp.charAt(0)) {
                answer += Character.toUpperCase(x);
            } else {
                answer += x;
            }
        }

        return answer;
    }
}