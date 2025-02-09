package TwoPointersSlidingWindow.rev;

import java.util.Scanner;

public class Main3R {
    public static int solution(int n, int k, int[] arr) {
        int lt = 0;
        int sum = 0;

        int answer = 0;

        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];

            if(rt - lt == k) {
                sum = sum - arr[lt];
                lt++;
            }

            answer = Math.max(answer,sum);
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        int k = in.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(n,k,arr));
    }
}
