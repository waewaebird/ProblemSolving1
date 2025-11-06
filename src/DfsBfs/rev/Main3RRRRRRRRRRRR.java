package DfsBfs.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3RRRRRRRRRRRR {
    // 최대점수 구하기(DFS)
    static int N;
    static int M;
    static List<int[]> list = new ArrayList<>();
    static int answer = 0;

    public static void DFS(int v, int point, int time) {
        if(v == N) {
            if(time > M) {
                return;
            }

            answer = Math.max(answer, point);

            return;
        } else {
            if(time > M) {
                return;
            }

            answer = Math.max(answer, point);

            DFS(v + 1, point + list.get(v)[0], time + list.get(v)[1]);
            DFS(v + 1, point, time);
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
