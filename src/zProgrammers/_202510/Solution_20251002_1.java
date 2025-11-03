package zProgrammers._202510;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution_20251002_1 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Deque<Integer> stack = new ArrayDeque<>();

        for(int x : moves) {
            for (int i = 0; i < board.length; i++) {
                if(board[i][x-1] > 0) {
                    if(stack.size() > 0 && stack.peek() == board[i][x-1]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[i][x-1]);
                    }

                    board[i][x-1] = 0;
                    break;
                }
            }
        }

        return answer;
    }
}