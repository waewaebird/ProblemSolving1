package GreedyAlgorithm;

import java.util.*;

//프림 최소스패닝트리 만드는법.
public class Main8 {
    static class Edge implements Comparable <Edge>{
        int vex;
        int cost;

        public Edge(int vex, int cost) {
            this.vex = vex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return Integer.compare(this.cost, o.cost);
        }
    }


    static int[] ch;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        List<List<Edge>> graph = new ArrayList<>();

        for (int i = 0; i <= n ; i++) {
            graph.add(new ArrayList<>());
        }

        int[] ch = new int[n+1];
        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            graph.get(a).add(new Edge(b,c));
            graph.get(b).add(new Edge(a,c));
            //무방향 그래프라 양쪽 다 넣어줘야 함.
        }

        int answer = 0;

        PriorityQueue<Edge> pq = new PriorityQueue<>();

        pq.offer(new Edge(1,0)); // 가상의 값, 1로 가는데 비용 0

        //그리디
        while(!pq.isEmpty()) {
            
            Edge tmp = pq.poll();

            int ev = tmp.vex;
            if(ch[ev] == 0) {
                ch[ev] = 1;
                answer += tmp.cost;

                for(Edge ob : graph.get(ev)) {
                    if(ch[ob.vex] == 0) { //무방향이라서 한번더 체크함.
                        pq.offer(new Edge(ob.vex, ob.cost));
                    }
                }
            }

        }
        System.out.println(answer);
    }

}
