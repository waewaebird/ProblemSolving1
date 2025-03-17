package Array.rev;

import java.util.Scanner;

public class Main4RRRRR {
    public static int[] solution(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            if(i == 0) {
                arr[i] = 1;
            } else if(i == 1) {
                arr[i] = 1;
            } else {
                arr[i] = arr[i-2] + arr[i-1];
            }
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
