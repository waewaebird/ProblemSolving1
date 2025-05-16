package zHackerRank;

import java.util.Scanner;

public class Main_20250516_1 {
    //Bill Division
    public static String solution(int n, int k, int[] arr, int c) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if(i != k){
                sum += arr[i];
            }
        }

        int answer = c - (sum/2);

        if(answer == 0) {
            return "Bon Appetit";
        } else {
            return String.valueOf(answer);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int c = in.nextInt();

        System.out.println(solution(n,k,arr,c));
    }
}
