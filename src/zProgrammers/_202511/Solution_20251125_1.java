package zProgrammers._202511;

class Solution_20251125_1 {
    public int solution(int n, String control) {
        int answer = n;

        for(char x : control.toCharArray()) {
            if(x == 'w') {
                answer = answer+1;
            } else if(x == 's') {
                answer = answer-1;
            } else if(x == 'd') {
                answer = answer+10;
            } else if(x == 'a') {
                answer = answer-10;
            }
        }

        return answer;
    }
}