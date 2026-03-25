package zProgrammers;

class Solution_20260325_2 {
    public int solution(int n) {
        int answer = (int) Math.ceil((double)n / (double)7);

        if(n <= 7) {
            answer = 1;
        }

        return answer;
    }
}