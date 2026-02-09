package zProgrammers._202601;

class Solution_20260105_1 {
    public int solution(int[][] dots) {
        int answer = 0;

        if(((dots[1][1] - dots[0][1]) / (dots[1][0] - dots[0][0])) == ((dots[3][1] - dots[2][1]) / (dots[3][0] - dots[2][0]))) {
            if((dots[1][1] - dots[0][1]) / (dots[1][0] - dots[0][0]) > 0) {
                answer = 1;
            }
        }

        if((dots[2][1] - dots[0][1]) / (dots[2][0] - dots[0][0]) == (dots[3][1] - dots[1][1]) / (dots[3][0] - dots[1][0])) {
            if((dots[2][1] - dots[0][1]) / (dots[2][0] - dots[0][0]) > 0) {
                answer = 1;
            }
        }

        if(((dots[3][1] - dots[0][1]) / (dots[3][0] - dots[0][0])) == ((dots[2][1] - dots[1][1]) / (dots[2][0] - dots[1][0]))) {
            if((dots[3][1] - dots[0][1]) / (dots[3][0] - dots[0][0]) > 0) {
                answer = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution_20260105_1 s = new Solution_20260105_1();

        System.out.println(s.solution(new int[][] {{1, 4}, {9, 2}, {3, 8}, {11, 6}})); // 1
        System.out.println(s.solution(new int[][] {{3,5}, {4,1}, {2,4}, {5,10}})); // 0
    }
}
