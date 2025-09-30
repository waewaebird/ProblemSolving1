package zProgrammers;

class Solution_20250930_2 {
    public long solution(int[] a, int[] b) {
        long answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += (a[i] * b[i]);
        }

        return answer;
    }
}