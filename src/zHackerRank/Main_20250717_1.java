package zHackerRank;

import java.util.Scanner;

public class Main_20250717_1 {
    // Counting Sort 1
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[]arr = new int[n];

        Integer max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            arr[a]++;
            max = Math.max(max, a);
        }

        //System.out.println(max);

        for (int i = 0; i < n; i++) {
            if(i < 100) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}
