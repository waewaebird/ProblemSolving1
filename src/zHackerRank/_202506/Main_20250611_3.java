package zHackerRank._202506;

import java.util.Scanner;

public class Main_20250611_3 {
    // Correctness and the Loop Invariant
    public static void solution(int n, int[] arr) {
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if(arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int x : arr) {
            System.out.print(x + " ");
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        solution(n,arr);
    }
}
