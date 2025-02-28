package TwoPointersSlidingWindow.rev;

import java.util.Scanner;

public class Main3RR {
    public static int solution(int n, int k, int[] arr) {
        int sum = 0;
        int lt = 0;

        int temp = 0;
        for (int rt = 0; rt < n; rt++) {
            temp += arr[rt];

            if(rt - lt == k-1) {
                sum = Math.max(sum, temp);
                temp = temp - arr[lt];
                lt++;

            }
        }
        return sum;
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
