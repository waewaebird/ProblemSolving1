package zProgrammers._202510;

import java.math.BigInteger;

class Solution_20251014_1 {
    public long solution(int n) {
        BigInteger[] dy = new BigInteger[2001];

        dy[1] = BigInteger.ONE;
        dy[2] = BigInteger.TWO;

        for (int i = 3; i <= n; i++) {
            dy[i] = dy[i-2].add(dy[i-1]);
        }

        BigInteger remind = dy[n].remainder(new BigInteger("1234567"));
        return Long.valueOf(String.valueOf(remind));
    }

    public static void main(String[] args) {
        Solution_20251014_1 s = new Solution_20251014_1();

        System.out.println(s.solution(2000));
    }
}