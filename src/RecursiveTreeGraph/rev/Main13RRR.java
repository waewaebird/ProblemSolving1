package RecursiveTreeGraph.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main13RRR {
    static int n;
    static int m;
    static int answer;
    static List<List<Integer>> graph;
    static int[] ch;

    public static void DFS(int v) {
        if(v == n) {
            answer++;
        } else {
            for(int cv : graph.get(v)) {
                if(ch[cv] == 0) {
                    ch[cv] = 1;
                    DFS(cv);
                    ch[cv] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

        graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(i, new ArrayList<>());
        }

        ch = new int[n+1];

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            graph.get(a).add(b);
        }

        ch[1] =1;
        DFS(1);

        System.out.println(answer);
    }
}
