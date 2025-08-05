package TwoPointersSlidingWindow.rev;

import java.util.Scanner;

public class Main3RRRRRR {
    // 최대 매출
    public static Integer solution(int n, int k, int[] arr) {
        int answer = 0;

        int sum = 0;

        int cnt = 0;
        int lt = 0;
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt];
            cnt++;

            if(cnt == k) {
                answer = Math.max(sum,answer);
                cnt--;
                sum = sum - arr[lt];
                lt++;
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
