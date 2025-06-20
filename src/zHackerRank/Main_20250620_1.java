package zHackerRank;

import java.util.Scanner;

public class Main_20250620_1 {
    // Cavity Map
    static int[] DI = {-1,0,0,1};
    static int[] DJ = {0,-1,1,0};

    public static char[][] solution(int n, int[][] arr) {
        char[][] answers = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int cnt1 = 0;
                int cnt2 = 0;
                for (int k = 0; k < 4; k++) {
                    int ti = i + DI[k];
                    int tj = j + DJ[k];


                    if(ti >= 0 && ti < n && tj >= 0 && tj < n) {
                        cnt1++;
                        if(arr[i][j] > arr[ti][tj]) {
                            cnt2++;
                        }
                    }
                }
                if(cnt1 == cnt2 && cnt1 >= 4) {
                    answers[i][j] = 'X';
                } else {
                    answers[i][j] = String.valueOf(arr[i][j]).charAt(0);
                }
            }
        }
        return answers;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String a = in.next();
            for (int j = 0; j < n; j++) {
                char temp = a.charAt(j);
                arr[i][j] = Character.getNumericValue(temp);
            }
        }

        char[][] answers = solution(n,arr);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(answers[i][j]);
            }
            System.out.println();
        }
    }
}
