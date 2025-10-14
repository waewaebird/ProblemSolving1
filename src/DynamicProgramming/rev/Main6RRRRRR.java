package DynamicProgramming.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main6RRRRRR {
    // 최대점수 구하기(냅색 알고리즘)
    static int N;
    static int M;
    static List<int[]> list = new ArrayList<>();
    static int answer = 0;

    public static void DFS(int v, int pSum, int tSum) {
        if(tSum > M) {
            return;
        }

        answer = Math.max(answer, pSum);

        if(v == N) {
            return;
        } else {
            DFS(v+1, pSum + list.get(v)[0], tSum + list.get(v)[1]);
            DFS(v+1, pSum, tSum);
        }
    }

    public static int solution() {
        int[] dy = new int[M+1];

        for (int i = 0; i < N; i++) {
            for (int j = M; j >= list.get(i)[1] ; j--) {
                dy[j] = Math.max(dy[j], dy[j-list.get(i)[1]] + list.get(i)[0]);
            }
        }

        return dy[M];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();

        for (int i = 0; i < N; i++) {
            int point = in.nextInt();
            int time = in.nextInt();

            list.add(new int[] {point, time});
        }

        //DFS(0,0,0);
        //System.out.println(answer);

        System.out.println(solution());


    }
}
