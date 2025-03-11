package RecursiveTreeGraph.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main13RRRR {
    static int n;
    static int m;
    static List<List<Integer>> graph;
    static int answer = 0;
    static int ch[];

    public static void DFS(int v) {
        if(v == n) {
            answer++;
        } else {
            for(int a : graph.get(v)) {
                if(ch[a] == 0) {
                    ch[a] = 1;
                    DFS(a);
                    ch[a] = 0;
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

        ch = new int[n+1];
        graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

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
