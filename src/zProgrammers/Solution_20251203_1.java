package zProgrammers;

class Solution_20251203_1 {
    public int solution(String myString, String pat) {
        int answer = 0;

        int result = myString.toLowerCase().indexOf(pat.toLowerCase());

        if(result > -1) {
            answer = 1;
        }

        return answer;
    }
}