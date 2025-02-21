package RecursiveTreeGraph.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main13R {
    static int n = 0; //노드
    static int m = 0; //간선
    static int answer = 0;
    static List<List<Integer>> list = new ArrayList<>();
    static int[] ch;

    public void DFS(int v) {
        if(n == v) {
            answer++;
        } else {
            for (int nv : list.get(v)) {
                if(ch[nv] == 0) {
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main13R T = new Main13R();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

        for (int i = 1; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        ch = new int[n+1];

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            list.get(a).add(b);
        }

        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);

    }
}
