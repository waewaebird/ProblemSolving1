package zProgrammers;

class Solution_20251114_2 {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];

        int I = 0;
        int J = 0;
        for(int x : num_list) {
            answer[I][J] = x;
            J++;

            if(J == n) {
                I++;
                J =0;
            }
        }

        return answer;
    }
}