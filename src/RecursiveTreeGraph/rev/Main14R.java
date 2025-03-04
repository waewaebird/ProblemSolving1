package RecursiveTreeGraph.rev;

import java.util.*;

public class Main14R {
    static int n, m = 0;
    static List<List<Integer>> graph;

    //배열에도 기록!
    static int[] ch, dis; // dis[3] 번은 1번에서 3번으로 가는 최소 거리

    public void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        ch[v] = 1;
        dis[v] = 0;

        queue.offer(v); //1번정점

        while (!queue.isEmpty()) {
            int 현재정점 = queue.poll();

            for (int nv : graph.get(현재정점)) { //인접리스트 탐색
                if(ch[nv] == 0) {
                    ch[nv] = 1;
                    queue.offer(nv);
                    dis[nv] = dis[현재정점] + 1;
                }
            }

        }
        
    }

    public static void main(String[] args) {
        Main14R T = new Main14R();
        Scanner in = new Scanner(System.in);

        n = in.nextInt(); //정점 vertex Node
        m = in.nextInt(); //간선 Edge

        graph = new ArrayList<>(); 

        for (int i = 0; i <= n; i++) { //인덱스 i부터 추가한다 (0은 무시) 1,2,3,4 ~
            graph.add(new ArrayList<>());
        }
        
        ch = new int[n+1]; //체크배열
        dis = new int[n+1]; //디스턴스배열

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b= in.nextInt();
            
            graph.get(a).add(b);
        }
        
        T.BFS(1);

        for (int i = 2; i <= n ; i++) {
            System.out.println(i + " : " + dis[i]);
        }

    }
}
