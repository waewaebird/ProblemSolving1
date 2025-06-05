package RecursiveTreeGraph.rev;

import java.util.*;

public class Main14RRRRRRR {
    // 그래프 최단거리
    static int N;
    static int M;
    static List<List<Integer>> list = new ArrayList<>();
    static int[] dis;
    static int[] ch;

    public static void DFS(int v) {
        for(Integer next : list.get(v)) {
            if(ch[next] == 0) {
                ch[next] = 1;
                dis[next] = Math.min(dis[v] + 1, dis[next]);
                DFS(next);
                ch[next] = 0;
            }
        }

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();

        for (int i = 0; i <= N ; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            list.get(a).add(b);
        }

        dis = new int[N+1];
        Arrays.fill(dis, Integer.MAX_VALUE);

        ch = new int[N+1];

        ch[1] = 1;
        dis[1] = 0;
        DFS(1);

        for (int i = 2; i <= N ; i++) {
            System.out.println(i + " : " + dis[i]);
        }
    }
}
