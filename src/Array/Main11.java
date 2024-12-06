package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main11 {
    public static int solution(int n,  int[][] arr) {
        int answer = 0;

        for(int j = 0 ; j < n ; j++) {
            List<Integer> temp = new ArrayList<>();
            for(int i = 0 ; i < n ; i++) {
                temp.add(arr[i][j]);

                //arr[0][0]
                //arr[0][1]
                //arr[0][2]
                //arr[0][3]
                //arr[0][4]
                //temp 1 3 3 2 1

            }
        }



        return answer;
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
