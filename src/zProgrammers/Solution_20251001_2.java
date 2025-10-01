package zProgrammers;

import java.math.BigInteger;

class Solution_20251001_2 {
    public int solution(String number) {
        return Integer.valueOf(String.valueOf(new BigInteger(number).remainder(new BigInteger(String.valueOf(9)))));
    }
}