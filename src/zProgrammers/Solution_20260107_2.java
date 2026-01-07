package zProgrammers;

class Solution_20260107_2 {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum1 = 1;
        int sum2 = 0;

        for(int x : num_list) {
            sum1 = sum1 * x;
            sum2 += x;
        }

        if(sum2 * sum2 > sum1) {
            answer = 1;
        }

        return answer;
    }
}