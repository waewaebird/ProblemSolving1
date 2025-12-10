package zProgrammers;

class Solution_20251210_1 {
    public int solution(int a, int b, int n) {
        int answer = 0;

        int total = n;

        while(total >= a) {
            answer += (total / a) * b;

            int remain = 0;
            if(total % a > 0) {
                remain = total % a;
            }

            total = (total / a) * b + remain;
        }

        return answer;
    }
}