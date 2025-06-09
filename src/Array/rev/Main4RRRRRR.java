package Array.rev;

import java.util.Scanner;

public class Main4RRRRRR {
    // 피보나치 수열
    public static int[] solution(int n) {
        int[] arr = new int[n+1];

        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;

        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] answers = solution(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(answers[i] + " ");
        }
    }
}
