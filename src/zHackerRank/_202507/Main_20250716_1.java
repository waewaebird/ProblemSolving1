package zHackerRank._202507;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main_20250716_1 {
    // The Maximum Subarray
    public static List<Integer> solution(int n, int[] arr) {
        List<Integer> answers = new ArrayList<>();

        int arrSum = 0;
        int dy[] = new int[n+1];

        for (int i = 1; i <= n; i++) {
            dy[i] = arr[i-1];
        }

        for (int i = 1; i <= n; i++) {
            dy[i] = Math.max(dy[i-1] + arr[i-1], dy[i]);
        }

        Arrays.sort(dy);
        arrSum = dy[n];
        if(arrSum == 0) {
            arrSum = dy[n-1];
        }

        int seqSum = 0;
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i] > 0) {
                seqSum += arr[i];
            } else {
                min = Math.max(min, arr[i]);
            }
        }

        if(seqSum == 0) {
            seqSum = min;
        }

        answers.add(arrSum);
        answers.add(seqSum);

        return answers;
    }


    public static void main(String[] args) {
        List<List<Integer>> answers = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }

            List<Integer> temps = solution(n,arr);
            answers.add(temps);
        }

        for(List<Integer> list : answers) {
            for(Integer x : list) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

    }
}
