package zProgrammers._202511;

class Solution_20251106_1 {
    public int solution(int[][] board) {
        int[] DI = {-1,-1,-1,0,0,1,1,1};
        int[] DJ = {-1,0,1,-1,1,-1,0,1};

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 1) {
                    for (int k = 0; k < 8; k++) {
                        int ni = i + DI[k];
                        int nj = j + DJ[k];

                        if(ni >= 0 && ni < board.length && nj >= 0 && nj < board[i].length) {
                            if(board[ni][nj] == 0) {
                                board[ni][nj] = 2;
                            }

                        }
                    }
                }
            }
        }

        int answer = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 0) {
                    answer++;
                }
            }
        }

        return answer;
    }
}