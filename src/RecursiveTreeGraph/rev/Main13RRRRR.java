package RecursiveTreeGraph.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main13RRRRR {
    // 경로탐색(인접리스트)
    static int N;
    static int M;
    static int[] ch;
    static List<List<Integer>> graph = new ArrayList<>();
    static int answer = 0;

    public static void DFS(int v) {
        if(v == N) {
            answer++;
        } else {
            for(Integer next : graph.get(v)) {
                if(ch[next] == 0) {
                    ch[next] = 1;
                    DFS(next);
                    ch[next] =0;
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
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            graph.get(a).add(b);
        }

        ch[1] = 1;
        DFS(1);

        System.out.println(answer);
    }
}
