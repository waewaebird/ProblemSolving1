package zProgrammers;

class Solution_20260112_1 {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for(int x : numbers) {
            answer += x;
            if(answer > n) {
                break;
            }
        }
        return answer;
    }
}