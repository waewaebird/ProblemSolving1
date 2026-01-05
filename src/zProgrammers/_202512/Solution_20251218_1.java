package zProgrammers._202512;

class Solution_20251218_1 {
    public int solution(int n) {
        String temp = Integer.toString(n,3);
        String reverse = new StringBuilder(temp).reverse().toString();

        return Integer.parseInt(reverse, 3);
    }
}