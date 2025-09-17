package zProgrammers;

class Solution_20250917_1 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Solution_20250917_1 s = new Solution_20250917_1();

        s.solution(new int[][] {{1,2},{2,3}} , new int[][] {{3,4},{5,6}});
        //s.solution(new int[][] {{1},{2}} , new int[][] {{3},{5}});
    }
}