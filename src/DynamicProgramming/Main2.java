package DynamicProgramming;

import java.util.Scanner;

public class Main2 {
    static int n;
    static int answer;
    static int[] dy;

    public static int solution(int n) {
        dy[1] = 1;
        dy[2] = 2;
        for (int i = 3; i <= n+1 ; i++) {
            dy[i] = dy[i-2] + dy[i-1];
        }
        return dy[n+1];
    }

    public static void DFS(int v, int sum) {
        if(sum >= n) {
            answer++;
            return;
        } else {
            DFS(1, sum+1);
            DFS(2, sum+2);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();

        dy = new int[n+2];

        DFS(1,0);

        System.out.println(answer);
        System.out.println(solution(n));
    }
}
