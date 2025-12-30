package zProgrammers;

class Solution_20251230_3 {
    public int solution(int[][] triangle) {
        int answer = 0;

        int[][] dp = new int[triangle.length][];

        for (int i = 0; i < 2; i++) {
            dp[i] = new int[triangle[i].length];
        }

        dp[0][0] = triangle[0][0];
        dp[1][0] = triangle[0][0] + triangle[1][0];
        dp[1][1] = triangle[0][0] + triangle[1][1];

        for (int i = 2; i < triangle.length; i++) {
            dp[i] = new int[triangle[i].length];
            for (int j = 0; j < triangle[i].length; j++) {
                if(j == 0) {
                    dp[i][j] = dp[i-1][0] + triangle[i][j];
                } else if(j == triangle[i].length-1){
                    dp[i][j] = dp[i-1][j-1] + triangle[i][j];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j-1] + triangle[i][j], dp[i-1][j] + triangle[i][j]);
                }

                answer = Math.max(answer, dp[i][j]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution_20251230_3 s = new Solution_20251230_3();

        System.out.println(s.solution(new int[][] {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}}));

    }
}