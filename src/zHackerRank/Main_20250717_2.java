package zHackerRank;

import java.util.Scanner;

public class Main_20250717_2 {
    // Counting Sort 2
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[]arr = new int[n];

        Integer max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            arr[i] = a;
            max = Math.max(max, a);
        }

        int[] reals = new int[max+1];

        for(int x : arr) {
            reals[x]++;
        }

        for (int i = 0; i < reals.length; i++) {
            int temp = reals[i];

            for (int j = 0; j < temp; j++) {
                System.out.print(i + " ");
            }
        }

    }
}
