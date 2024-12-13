package Array.rev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main9RR {
    private static int solution(int n , int[][] arr) {

        List<Integer> answers = new ArrayList<>();
        int sumXY = 0;
        int sumYX = 0;

        for(int i = 0 ; i < n ; i++) {
            int sumX = 0;
            int sumY = 0;
            for(int j = 0 ; j < n ; j++) {
                if(i == j) {
                    sumXY = sumXY+arr[i][j];
                }
                sumX = sumX + arr[i][j];
                sumY = sumY + arr[j][i];
            }
            answers.add(sumX);
            answers.add(sumY);
            sumYX = sumYX + arr[i][n-i-1];
        }

        answers.add(sumXY);
        answers.add(sumYX);
        return Collections.max(answers);
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
        System.out.println(solution(n, arr));
    }
}
