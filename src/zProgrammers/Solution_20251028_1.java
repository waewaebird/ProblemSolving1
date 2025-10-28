package zProgrammers;

class Solution_20251028_1 {
    public int solution(int[] num_list) {
        int answer = 0;

        for(int x : num_list) {
            while(x > 1) {
                if(x % 2 != 0) {
                    x--;
                }
                x = x / 2;
                answer++;
            }
        }

        return answer;
    }
}