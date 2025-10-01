package zProgrammers._202509;

class Solution_20250906_1 {
    // 짝수와 홀수
    public String solution(int num) {
        String answer = "Odd";

        if(num % 2 == 0) {
            answer = "Even";
        }

        return answer;
    }
}