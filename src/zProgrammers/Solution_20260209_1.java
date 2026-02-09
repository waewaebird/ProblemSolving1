package zProgrammers;

class Solution_20260209_1 {
    public int solution(int[] num_list) {
        int answer = 0;

        int sum1 = 0;
        int sum2 = 0;

        boolean flag = true;
        for(int x : num_list) {
            if(flag) {
                sum1 += x;
                flag = false;
            } else {
                sum2 += x;
                flag = true;
            }
        }

        answer = Math.max(sum1,sum2);

        return answer;
    }
}