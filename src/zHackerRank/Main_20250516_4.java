package zHackerRank;

import java.util.*;

public class Main_20250516_4 {
    // Circular Array Rotation
    public static void solution(int n, int[] arr, int q, int out, int[] outs) {
        for(int x: outs) {
            int temp = x - q;
            while(temp < 0) {
                temp = temp + n;
            }
            System.out.println(arr[temp]);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int q = in.nextInt();
        int out = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int[] outs = new int[out];
        for (int i = 0; i < out; i++) {
            outs[i] = in.nextInt();
        }

        solution(n,arr, q,out,outs);

    }
}


