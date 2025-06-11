package zHackerRank;

import java.util.Scanner;

public class Main_20250611_1 {
    // Insertion Sort - Part 1
    public static void solution(int n, int[] arr) {
        boolean flag = false;
        int temp = arr[arr.length-1];

        for (int i = n-2; i >= 0 ; i--) {
            if(flag) {
                break;
            }

            if(arr[i] >= temp) {
                arr[i+1] = arr[i];
            } else {
                arr[i+1] = temp;
                flag = true;
            }

            for(int x : arr) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        if(!flag) {
            arr[0] = temp;
            for(int x : arr) {
                System.out.print(x + " ");
            }
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
