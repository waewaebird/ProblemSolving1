package zHackerRank._202506;

import java.util.Arrays;
import java.util.Scanner;

public class Main_20250619_2 {
    // Greedy Florist
    public static int solution(int n, int k, int[] arr) {
        Arrays.sort(arr);

        int answer = 0;
        if(n == k) {
            for (int i = 0; i < n; i++) {
                answer += arr[i];
            }
        } else {
            int cnt = 0;
            int cntMulti = 0;

            for (int i = n-1; i >= 0 ; i--) {
                cnt++;
                answer += (cntMulti + 1) * arr[i];
                if(cnt == k) {
                    cntMulti++;
                    cnt = 0;
                }
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
