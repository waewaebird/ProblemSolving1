package RecursiveTreeGraph.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main13RRRRRRRR {
    // 경로탐색(인접리스트)
    static int N;
    static int M;
    static List<List<Integer>> list = new ArrayList<>();
    static int answer = 0;
    static int[] ch;

    public static void DFS(int v) {
        if(v == N) {
            answer++;
        } else {
            for(int x : list.get(v)) {
                if(ch[x] == 0) {
                    ch[x] = 1;
                    DFS(x);
                    ch[x] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();

        ch = new int[N+1];

        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            list.get(a).add(b);
        }

        ch[1] = 1;
        DFS(1);

        System.out.println(answer);
    }
}
