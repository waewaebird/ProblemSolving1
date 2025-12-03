package StackQueue.rev;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main3RRRRRRRR {
    // 크레인 인형뽑기(카카오)
    public static int solution(int n, int[][] board, int m, int[] moves) {
        int answer = 0;

        Deque<Integer> stack = new ArrayDeque<>();

        for(int x : moves) {
            for (int i = 0; i < n; i++) {
                if(board[i][x-1] != 0) {
                    if(stack.isEmpty()) {
                        stack.push(board[i][x-1]);
                    } else {
                        if(stack.peek() == board[i][x-1]) {
                            stack.pop();
                            answer += 2;
                        } else {
                            stack.push(board[i][x-1]);
                        }
                    }
                    board[i][x-1] = 0;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[][] board = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = in.nextInt();
            }
        }

        int m = in.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = in.nextInt();
        }

        System.out.println(solution(n,board,m,moves));
    }
}

