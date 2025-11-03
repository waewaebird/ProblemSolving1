package zProgrammers._202510;

import java.math.BigInteger;


class Solution_20251027_2 {
    public int solution(int n) {

        BigInteger[] arr = new BigInteger[n];

        arr[0] = BigInteger.ONE;
        arr[1] = BigInteger.ONE;

        for (int i = 2; i < n; i++) {
            arr[i] = arr[i-2].add(arr[i-1]);
        }

        return Integer.valueOf(String.valueOf(arr[n-1].remainder(BigInteger.valueOf(1234567))));
    }
}