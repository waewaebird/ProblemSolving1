package zProgrammers._202512;

class Solution_20251223_2 {
    public int solution(int a, int b) {
        String temp = String.valueOf(a) + java.lang.String.valueOf(b);
        int sum1 = Integer.valueOf(temp);
        int sum2 = a*b*2;

        return Math.max(sum1, sum2);
    }
}