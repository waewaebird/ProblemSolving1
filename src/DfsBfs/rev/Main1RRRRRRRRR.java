package DfsBfs.rev;

import java.util.Arrays;
import java.util.Scanner;

public class Main1RRRRRRRRR {
    // 합이 같은 부분집합(DFS : 아마존 인터뷰)
    public static String solution(int n, int[] arr) {
        int sum = Arrays.stream(arr).sum();

        if(sum % 2 != 0) {
            return "NO";
        }

        int mid = sum/2;

        boolean[] dp = new boolean[mid+1];
        dp[0] = true;

        for (int i = 0; i < n; i++) {
            for (int j = mid; j >= arr[i]; j--) {
                if(dp[j-arr[i]] == true) {
                    dp[j] = true;
                }
            }
        }

        if(dp[mid] == true) {
            return "YES";
        } else{
            return "NO";
        }
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
