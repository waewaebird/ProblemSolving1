package zProgrammers._202511;

class Solution_20251126_2 {
    public int solution(int n) {
        int answer = 0;

        int len = (n/2) + 1;

        for (int i = 1; i < len; i++) {
            if(n % i == 0) {
                answer += i;
            }
        }

        return answer+n;
    }
}