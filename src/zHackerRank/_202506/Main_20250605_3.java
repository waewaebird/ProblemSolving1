package zHackerRank._202506;

import java.util.Scanner;

public class Main_20250605_3 {
    // Intro to Tutorial Challenges
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int v= in.nextInt();

        int n = in.nextInt();
        int[] arr = new int[n];

        int answer = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();

            if(arr[i] == v) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}
