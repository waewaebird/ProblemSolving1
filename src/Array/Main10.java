package Array;

import java.util.Scanner;

public class Main10 {
    public static int solution(int n , int[][] arr) {
        return 0;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];

        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < n ; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        solution(n, arr);
    }
}
