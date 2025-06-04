package zHackerRank._202505;

import java.util.Scanner;


public class Main_20250521_1 {
    // Jumping on the Clouds: Revisited
    public static int solution(int n, int k, int[] arr) {
        int energy = 100;

        boolean flag = true;

        int i = 0;
        while(flag) {
            if(energy < 1) {
                break;
            }
            int last = 0;
            for (i = i; i < n; i = i+k) {
                if(arr[i] == 0) {
                    energy = energy - 1;
                } else {
                    energy = energy - 1 - 2;
                }
                last = i;
            }

            if(last == n - k) {
                flag = false;
            }

            i = last + k - n;
        }

        return energy;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(n,k,arr));
    }

}
