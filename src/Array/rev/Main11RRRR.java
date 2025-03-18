package Array.rev;

import java.util.NavigableMap;
import java.util.Scanner;

public class Main11RRRR {
    public static int solution(int n, int[][] arr) {
        int answer = Integer.MIN_VALUE;
        int man = 0;

        for (int i = 0; i < n; i++) {
            int cnt = 0;

            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 5; k++) {
                    if(arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }

            if(cnt > answer) {
                answer = cnt;
                man = i;
            }

        }

        return man+1;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[][] arr = new int[n][5];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(solution(n,arr));
    }
}
