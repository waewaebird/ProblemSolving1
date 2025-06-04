package zHackerRank._202505;

import java.util.Scanner;

public class Main_20250514_3 {
    public static int[] solution(int n, int[] arr) {
        int[] answer = new int[2];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int high = 0;
        int low = 0;

        for (int i = 0; i < n; i++) {
            if(i == 0) {
                min = arr[i];
                max = arr[i];
            } else {
                if(arr[i] > max) {
                    high++;
                    max = arr[i];
                }

                if(arr[i] < min) {
                    low++;
                    min = arr[i];
                }
            }
        }

        answer[0] = high;
        answer[1] = low;

        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for(int x: solution(n, arr)) {
            System.out.print(x + " ");
        }

    }
}
