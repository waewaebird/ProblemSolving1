package StackQueue.rev;

import java.util.Scanner;
import java.util.Stack;

public class Main3R {
    //인형뽑기

    public static int solution(int n, int[][] arr, int m, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < m; i++) {
            int temp = moves[i] - 1;

            for (int j = 0; j < n; j++) {
                if(arr[j][temp] > 0) {
                    if(stack.size() > 0 && stack.peek() == arr[j][temp]) {
                        stack.pop();
                        answer++;
                    } else {
                        stack.push(arr[j][temp]);
                    }
                    arr[j][temp] = 0;
                    break;
                }
            }
        }
        return answer*2;
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
