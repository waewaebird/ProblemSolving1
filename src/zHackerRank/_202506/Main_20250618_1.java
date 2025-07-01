package zHackerRank._202506;

import java.util.Arrays;
import java.util.Scanner;

public class Main_20250618_1 {
    // Priyanka and Toys
    public static int solution(int n, int[] arr) {
        int answer = 1;

        Arrays.sort(arr);

        int lt = 0;
        for (int rt = 0; rt < n; rt++) {
            if(arr[rt] - arr[lt] > 4) {
                answer++;
                lt = rt;
            }
        }

        return answer;
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
