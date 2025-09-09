package StackQueue.rev;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main3RRRRRR {
    // 크레인 인형뽑기(카카오)
    public static int solution(int n, int[][] arr, int m, int[] moves) {
        int answer = 0;
        Deque<Integer> stack = new ArrayDeque<>();

        for(int move : moves) {
            int now = move-1;

            for (int i = 0; i < n; i++) {
                if(arr[i][now] != 0) {
                    boolean isPeek = false;
                    if(!stack.isEmpty()) {
                        if(stack.peek() == arr[i][now]) {
                            isPeek = true;
                            stack.pop();
                            answer += 2;
                        }
                    }

                    if(!isPeek) {
                        stack.push(arr[i][now]);
                    }

                    arr[i][now] = 0;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int m = in.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = in.nextInt();
        }

        System.out.println(solution(n,arr,m,moves));
    }
}
