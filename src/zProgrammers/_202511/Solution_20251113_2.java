package zProgrammers._202511;

class Solution_20251113_2 {
    public int solution(int n) {
        int cnt = Integer.bitCount(n);

        int answer = 0;
        for (int i = n+1; i <= 1000000; i++) {
            if(cnt == Integer.bitCount(i)) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}