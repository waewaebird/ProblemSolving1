package StackQueue.rev;

import java.util.Scanner;
import java.util.Stack;

public class Main3RR {
    // 인형뽑기
    public static int solution(int n, int[][] arr, int m, int[] move) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for (int x : move) {
            for (int i = 0; i < n; i++) {
                if(arr[i][x-1] > 0) {
                    if(stack.size() == 0) {
                        stack.push(arr[i][x-1]);
                        arr[i][x-1] = 0;
                    } else if(stack.size() > 0) {
                        if(stack.peek() == arr[i][x-1]) {
                            stack.pop();
                            answer += 2;
                        } else {
                            stack.push(arr[i][x-1]);
                        }
                        arr[i][x-1] = 0;
                    }
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
        int[] move = new int[m];

        for (int i = 0; i < m; i++) {
            move[i] = in.nextInt();
        }

        System.out.println(solution(n,arr,m,move));
    }
}
