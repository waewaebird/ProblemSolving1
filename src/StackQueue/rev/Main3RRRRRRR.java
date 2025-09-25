package StackQueue.rev;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main3RRRRRRR {
    public static Integer solution(int n, int[][] arr, int m, int[] moves) {
        int answer = 0;

        Deque<Integer> stack = new ArrayDeque<>();

        for(int x : moves) {
            for (int i = 0; i < n; i++) {
                if(arr[i][x-1] != 0) {
                    if(stack.size() > 0) {
                        if(stack.peek() == arr[i][x-1]) {
                            stack.pop();
                            answer += 2;
                        } else {
                            stack.push(arr[i][x-1]);
                        }
                    } else {
                        stack.push(arr[i][x-1]);
                    }
                    arr[i][x-1] = 0;
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
