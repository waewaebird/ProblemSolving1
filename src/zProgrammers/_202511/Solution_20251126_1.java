package zProgrammers._202511;

class Solution_20251126_1 {
    public long solution(long n) {
        long answer = -1;

        long temp = (long) Math.sqrt(n);
        if(temp * temp == n) {
            answer = (temp+1) * (temp+1);
        }

        return answer;
    }
}