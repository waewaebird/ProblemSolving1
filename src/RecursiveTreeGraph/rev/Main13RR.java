package RecursiveTreeGraph.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main13RR {
    static int[] ch;
    static int n;
    static int m;
    static List<List<Integer>> graph;
    static int answer = 0;

    public static void DFS(int v) {
        if(v == n) {
            answer++;
        } else {
            for(int cv : graph.get(v)) {
                // 2 3
                if (ch[cv] == 0) {
                    ch[cv] = 1;
                    DFS(cv);
                    ch[cv] = 0;
                }
            }
        }

    }


    public static void main(String[] args) {
        Main13RR T = new Main13RR();
        Scanner in = new Scanner(System.in);

        graph = new ArrayList<>();

        n = in.nextInt();
        m = in.nextInt();

        for (int i = 0; i <= n; i++) {
            graph.add(i, new ArrayList<>());
        }

        ch = new int[n+1];

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            graph.get(a).add(b);
        }

        ch[1] = 1;
        DFS(1);
        System.out.println(answer);
    }
}
