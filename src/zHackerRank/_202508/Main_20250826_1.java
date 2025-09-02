package zHackerRank._202508;

import java.util.Scanner;

public class Main_20250826_1 {
    // Beautiful Pairs
    public static int solution(int n, int[] a, int[] b) {
        int[] ach = new int[n];
        int[] bch = new int[n];

        int answer = 1;
        for (int i = 0; i < n; i++) {
            int now = a[i];

            for (int j = 0; j < n; j++) {
                if(now == b[j]) {
                    if(bch[j] == 0) {
                        bch[j] = 1;
                        ach[i] = 1;
                        answer++;
                        break;
                    }
                }
            }
        }

        if(answer > n) {
            answer = answer - 2;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }

        System.out.println(solution(n,a,b));
    }
}
