package TwoPointersSlidingWindow.rev;

import java.util.Scanner;

public class Main4RRR {
    // 연속 부분수열
    public static Integer solution(int n, int m, int[] arr) {
        int answer = 0;

        int sum = 0;

        int lt = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if(sum >= m) {
                if(sum == m) {
                    answer++;
                }

                while(sum >= m) {
                    sum -= arr[lt];
                    lt++;

                    if(sum == m) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(n,m,arr));
    }
}
