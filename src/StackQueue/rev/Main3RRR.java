package StackQueue.rev;

import java.util.Scanner;
import java.util.Stack;

public class Main3RRR {
    //크레인 인형뽑기(카카오)
    public static int solution(int n , int[][] board , int[] arr) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(int x : arr) {
            for (int i = 0; i < n; i++) {
                if(board[i][x-1] != 0) {
                    if(stack.size() == 0) {
                        stack.push(board[i][x-1]);
                    } else {
                        if(stack.peek() == board[i][x-1]) {
                            stack.pop();
                            answer += 2;
                        } else {
                            stack.push(board[i][x-1]);
                        }
                    }
                    board[i][x-1]  =0;
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
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(n, board, arr));
    }
}
