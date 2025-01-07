package TwoPointersSlidingWindow;

import java.util.Scanner;

public class Main3 {
    public static int solution2(int n, int k, int[] arr) {
        int answer= 0;
        int sum = 0;

        for(int i = 0 ; i < k ; i++) {
            sum+= arr[i];
        }
        answer = sum;

        for (int i = k; i < n; i++) {
            sum+=(arr[i]-arr[i-k]);
            answer = Math.max(answer, sum);
        }
        return answer;
    }


    public static int solution(int n, int k, int[] arr) {
        int max = Integer.MIN_VALUE;

        int answer = 0;
        for (int i = 0; i < k; i++) {
            answer += arr[i];
        }

        max = answer;

        for (int i = 1; i < n-k+1; i++) {
            answer = answer - arr[i-1] + arr[i+k-1];

            if(answer > max) {
                max = answer;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution2(n, k, arr));
    }

}
