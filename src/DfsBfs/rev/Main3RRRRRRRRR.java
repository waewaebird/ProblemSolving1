package DfsBfs.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3RRRRRRRRR {
    // 최대점수 구하기(DFS)
    static int N;
    static int M;
    static List<int[]> list = new ArrayList<>();
    static int answer = 0;

    public static void DFS(int v, int points, int times) {
        if(times > M) {
            return;
        }

        answer = Math.max(answer, points);

        if(v == N) {
            return;
        } else {
            DFS(v+1, points + list.get(v)[0], times + list.get(v)[1]);
            DFS(v+1, points, times);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();

        for (int i = 0; i < N; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            list.add(new int[] {a,b});
        }

        DFS(0,0,0);
        System.out.println(answer);
    }
}
