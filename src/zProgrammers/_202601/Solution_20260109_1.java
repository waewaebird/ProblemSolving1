package zProgrammers._202601;

class Solution_20260109_1 {
    public int solution(int[] num_list) {
        int answer = 0;

        if(num_list.length > 10) {
            for(int x : num_list) {
                answer += x;
            }
        } else {
            answer++;
            for(int x : num_list) {
                answer *= x;
            }
        }

        return answer;
    }
}