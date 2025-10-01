package zProgrammers._202509;

class Solution_20250922_4 {
    public int solution(int n) {
        int answer = 0;

        int sum = 1;
        for (int i = 1; i < 12 ; i++) {
            sum = sum * i;

            if(sum >= n) {
                if(sum == n) {
                    answer = i;
                } else {
                    answer = i-1;
                }
                break;
            }
        }

        return answer;
    }
}