package DfsBfs.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3RRRRRR {
    // 최대점수 구하기(DFS)
    static class Test {
        int point;
        int time;

        public Test(int point, int time) {
            this.point = point;
            this.time = time;
        }
    }

    static int N;
    static int M;
    static List<Test> list = new ArrayList<>();
    static int answer = 0;

    public static void DFS(int v, int pSum, int tSum) {
        if(M >= tSum) {
            answer = Math.max(answer, pSum);
        }

        if(v == N) {
            return;
        } else {
            DFS(v+1, pSum + list.get(v).point, tSum + list.get(v).time);
            DFS(v+1, pSum, tSum);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();

        for (int i = 0; i < N; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            list.add(new Test(a,b));
        }

        DFS(0, 0, 0);
        System.out.println(answer);
    }
}
