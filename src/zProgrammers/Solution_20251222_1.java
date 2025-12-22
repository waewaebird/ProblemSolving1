package zProgrammers;

class Solution_20251222_1 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        int a = Integer.MIN_VALUE;
        int len = Math.min(n,m);
        for (int i = 1; i <= len; i++) {
            if(n % i == 0 && m % i == 0) {
                a = Math.max(a,i);
            }
        }

        int b = Integer.MAX_VALUE;
        len = n*m;
        for (int i = len; i > 0; i--) {
            if(i % n == 0 && i % m == 0) {
                b = Math.min(b,i);
            }
        }

        answer[0] = a;
        answer[1] = b;

        return answer;
    }
}