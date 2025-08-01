package zHackerRank._202507;

import java.util.Arrays;
import java.util.Scanner;

public class Main_20250703_2 {
    // Max Min
    public static Integer solution(int n, int k, int[] arr) {
        Arrays.sort(arr);
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < n-k+1; i++) {
            answer = Math.min(arr[k-1+i] - arr[i], answer);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(n,k,arr));
    }

}

