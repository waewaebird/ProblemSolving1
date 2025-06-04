package zHackerRank._202505;

import java.util.Scanner;

public class Main_20250527_3 {
    // The Power Sum
    static int X;
    static int N;
    static int answer;

    public static void DFS(int v, int sum) {
        if(sum > X) {
            return;
        }

        if(sum >= X) {
            if(sum == X) {
                answer++;
            }
            return;
        }

        if(v == X/2 + 1) {
            return;
        } else {
            DFS(v + 1, (int) (sum + Math.pow(v , N)));
            DFS(v + 1, sum);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        X = in.nextInt();
        N = in.nextInt();

        DFS(1, 0);

        System.out.println(answer);
    }


}
