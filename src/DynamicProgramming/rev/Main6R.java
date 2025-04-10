package DynamicProgramming.rev;

import java.util.Scanner;

public class Main6R {
    static class Problem {
        int point;
        int time;
        public Problem(int point, int time) {
            this.point = point;
            this.time = time;
        }
    }

    public static int solution(int n, int m, Problem[] arr) {
        int[] dy = new int[m+1];

        for (int i = 0; i < n; i++) {
            for (int j = m; j >= arr[i].time ; j--) {
                dy[j] = Math.max(dy[j], dy[j-arr[i].time] + arr[i].point);
            }
        }

        return dy[m];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        Problem[] arr = new Problem[n];

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            arr[i] = new Problem(a,b);
        }

        System.out.println(solution(n,m,arr));

    }
}
