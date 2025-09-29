package Array.rev;

import java.util.Arrays;
import java.util.Scanner;

public class Main5RRR {
    // 소수(에라토스테네스 체)
    public static Integer solution(int n) {
        int[] arr = new int[n+1];

        Arrays.fill(arr, 1);

        for (int i = 2; i <= n; i++) {
            if(arr[i] == 0) {
                continue;
            }

            for (int j = 2; j * i <= n; j++) {
                arr[j*i] = 0;
            }
        }

        int answer = 0;
        for (int i = 2; i <= n; i++) {
            if(arr[i] == 1) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println(solution(n));
    }
}
