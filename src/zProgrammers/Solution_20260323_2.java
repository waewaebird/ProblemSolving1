package zProgrammers;

class Solution_20260323_2 {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder();

        for(char x : myString.toCharArray()) {
            if(x < 'l') {
                answer.append('l');
            } else {
                answer.append(x);
            }
        }

        return answer.toString();
    }
}