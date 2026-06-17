package zProgrammers;

class Solution_20260617_1 {
    public int solution(int n, int k) {
        int water = k - (n/10);


        return 12000*n + water*2000;
    }
}