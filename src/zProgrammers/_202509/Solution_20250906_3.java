package zProgrammers._202509;

class Solution_20250906_3 {
    // 분수의 덧셈
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        int a = numer1 * denom2 + numer2 * denom1;
        int b = denom1 * denom2;

        int max = Math.max(a,b);
        while(true) {
            int cnt = 0;
            for (int i = 2; i <= max; i++) {
                if(a % i == 0 && b % i == 0) {
                    a = a / i;
                    b = b / i;
                    cnt++;
                }
            }
            if(cnt == 0) {
                break;
            }
        }

        answer[0] = a;
        answer[1] = b;

        return answer;
    }
}