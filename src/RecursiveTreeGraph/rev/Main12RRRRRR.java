package RecursiveTreeGraph.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main12RRRRRR {
    static int N;
    static int M;
    static List<List<Integer>> list = new ArrayList<>();
    static int[] ch;
    static int answer = 0;

    public static void DFS(int v) {
        if(v == N) {
            answer++;
        } else {
            for(Integer edge : list.get(v)) {
                if(ch[edge] == 0) {
                    ch[edge] = 1;
                    DFS(edge);
                    ch[edge] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();

        ch = new int[N+1];
        for (int i = 1; i <= N; i++) {
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
