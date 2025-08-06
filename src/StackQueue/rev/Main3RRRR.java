package StackQueue.rev;

import java.util.*;

public class Main3RRRR {
    // 크레인 인형뽑기(카카오)
    public static Integer solution(int n, int[][] arr, int m, int[] moves) {
        int answer = 0;
        Deque<Integer> box = new ArrayDeque<>();

        for (int i = 0; i < m; i++) {
            int temp = moves[i] - 1;

            for (int j = 0; j < n; j++) {
                if(arr[j][temp] > 0) {
                    if(box.size() == 0) {
                        box.push(arr[j][temp]);
                    } else {
                        if(box.peek() == arr[j][temp]) {
                            box.pop();
                            answer += 2;
                        } else {
                            box.push(arr[j][temp]);
                        }
                    }
                    arr[j][temp] = 0;
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
