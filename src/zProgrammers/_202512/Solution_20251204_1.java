package zProgrammers._202512;

class Solution_20251204_1 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n ; j++) {
                if(i * j >= n) {
                    if(i*j == n) {
                        answer++;
                    }
                    break;
                }
            }
        }
        return answer;
    }
}