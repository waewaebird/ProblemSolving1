package zProgrammers;

class Solution_20251217_2 {
    public long solution(int left, int right) {
        long answer = 0;

        for (int i = left; i <= right; i++) {
            int temp = 0;

            for (int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    temp++;
                }
            }

            if(temp % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }

        }

        return answer;
    }
}