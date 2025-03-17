package TwoPointersSlidingWindow.rev;

import java.util.Scanner;

public class Main3RRRR {
    public static int solution(int n, int k, int[] arr) {
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int answer = sum;

        for (int i = k; i < n; i++) {
            sum = sum-arr[i-k]+arr[i];
            answer = Math.max(sum,answer);
        }

        return answer;
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
