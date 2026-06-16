package zProgrammers;

class Solution_20260616_2 {
    public int solution(int n) {
        int answer = 0;

        int max = Math.max(n,6);

        for (int i = max; i <= n*6; i++) {
            if(i % n == 0 && i % 6 == 0) {
                answer = i;
                break;
            }
        }

        return answer/6;
    }
}