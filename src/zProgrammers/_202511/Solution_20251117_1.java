package zProgrammers._202511;

class Solution_20251117_1 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i < n; i++) {
            if(n % i == 1) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}