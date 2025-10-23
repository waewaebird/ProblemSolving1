package Array.rev;

import java.util.Scanner;

public class Main4RRRRRRRRRR {
    // 피보나치 수열
    public static int[] solution(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < n; i++) {
            arr[i] = arr[i-2] + arr[i-1];
        }

        return arr;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for(int x : solution(n)) {
            System.out.print(x + " ");
        }
    }
}
