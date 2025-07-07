package zHackerRank;

import java.util.Scanner;

public class Main_20250707_3 {
    // Forming a Magic Square
    public static Integer solution(int[][] arr) {
        int answer = Integer.MAX_VALUE;

        int[][] ma1 = {{4,9,2}, {3,5,7}, {8,1,6}};
        int[][] ma2 = {{6,1,8}, {7,5,3}, {2,9,4}};
        int[][] ma3 = {{8,3,4}, {1,5,9}, {6,7,2}};
        int[][] ma4 = {{2,7,6}, {9,5,1}, {4,3,8}};
        int[][] ma5 = {{8,1,6}, {3,5,7}, {4,9,2}};
        int[][] ma6 = {{2,9,4}, {7,5,3}, {6,1,8}};
        int[][] ma7 = {{6,7,2}, {1,5,9}, {8,3,4}};
        int[][] ma8 = {{4,3,8}, {9,5,1}, {2,7,6}};

        int temp1 = 0;
        int temp2 = 0;
        int temp3 = 0;
        int temp4 = 0;
        int temp5 = 0;
        int temp6 = 0;
        int temp7 = 0;
        int temp8 = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                temp1 += Math.abs(arr[i][j] - ma1[i][j]);
                temp2 += Math.abs(arr[i][j] - ma2[i][j]);
                temp3 += Math.abs(arr[i][j] - ma3[i][j]);
                temp4 += Math.abs(arr[i][j] - ma4[i][j]);
                temp5 += Math.abs(arr[i][j] - ma5[i][j]);
                temp6 += Math.abs(arr[i][j] - ma6[i][j]);
                temp7 += Math.abs(arr[i][j] - ma7[i][j]);
                temp8 += Math.abs(arr[i][j] - ma8[i][j]);
            }
        }

        answer = Math.min(answer, temp1);
        answer = Math.min(answer, temp2);
        answer = Math.min(answer, temp3);
        answer = Math.min(answer, temp4);
        answer = Math.min(answer, temp5);
        answer = Math.min(answer, temp6);
        answer = Math.min(answer, temp7);
        answer = Math.min(answer, temp8);

        return answer;
    }

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(solution(arr));
    }
}
