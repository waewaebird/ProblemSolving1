package TwoPointersSlidingWindow.rev;

import java.util.Scanner;

public class Main3RRRRRRRRRR {
    // 최대 매출
    public static int solution(int n, int k, int[] arr) {
        int answer = 0;
        int cnt = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            cnt++;
            sum += arr[i];

            answer = Math.max(sum,answer);

            if(cnt == k) {
                sum -= arr[i-k+1];
                cnt--;
            }
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
