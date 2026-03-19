package Array.rev;

import java.util.Scanner;

public class Main5RRRR {
    // 소수(에라토스테네스 체)
    public static int solution(int n) {
        int[] arr = new int[n+1];

        for (int i = 2; i <= n; i++) {
            if(i == 2 || i == 3) {
                for (int j = i*2; j <= n; j = j+i) {
                    arr[j] = 1;
                }
            } else {
                if(arr[i] == 0) {
                    for (int j = i*2; j <= n; j = j+i) {
                        arr[j] = 1;
                    }
                }
            }
        }

        int answer = 0;
        for (int i = 2; i <= n; i++) {
            if(arr[i] == 0) {
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
