package StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class Main3 {
    public static int solution2(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (int pos : moves) {
            for (int i = 0; i < board.length; i++) { // 행 크기
                if(board[i][pos-1] != 0) {
                    int tmp = board[i][pos-1];
                    board[i][pos-1]=0;
                    if(!stack.isEmpty() && tmp == stack.peek()) {
                        answer += 2;
                        stack.pop();
                    }
                    else {
                        stack.push(tmp);
                    }
                    break;
                }
            }
        }
        return answer;
    }

    public static int solution(int n, int[][] board, int m, int[] moves) {
        Stack<Integer> st = new Stack<>();
        int answer = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(board[moves[i]-1][j] > 0) {
                    if(!st.empty()) {
                        if(st.peek() == board[moves[i]-1][j]) {
                            st.pop();
                            answer = answer + 2;
                        } else {
                            st.push(board[moves[i]-1][j]);
                        }
                        board[moves[i]-1][j] = 0;
                    } else {
                        st.push(board[moves[i]-1][j]);
                        board[moves[i]-1][j] = 0;
                    }
                    break;
                } else if(board[moves[i]-1][j] == 0) {
                    continue;
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

        /*for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[j][i] = in.nextInt();
            }
        }*/

        int m = in.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = in.nextInt();
        }

        System.out.println(solution2(board,moves));
    }
}
