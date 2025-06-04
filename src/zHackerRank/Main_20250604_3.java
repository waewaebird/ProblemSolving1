package zHackerRank;

import java.util.Scanner;

public class Main_20250604_3 {
    // Lonely Integer
    public static int solution(int n, int[] arr) {
        int answer = 0;
        for(int x : arr) {
            answer ^= x;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(n,arr));
    }
}
