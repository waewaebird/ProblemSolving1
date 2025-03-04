package Array.rev;

import java.util.Scanner;

public class Main11RRR {
    public static int solution(int n, int[][] arr) {
        int answer = 0;

        int sum = 0;

        for (int i = 0; i < n; i++) {
            int temp = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 5; k++) {
                    if(arr[i][k] == arr[j][k]) {
                        temp++;
                        break;
                    }
                }
            }

            if(temp > sum) {
                sum = temp;
                answer = i+1;
            }
        }

        return answer;
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
