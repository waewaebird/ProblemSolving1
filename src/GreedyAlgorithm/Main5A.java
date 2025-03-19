package GreedyAlgorithm;

import java.util.*;

public class Main5A {
    static class Edge implements Comparable<Edge>{
        int vex;
        int cost;

        public Edge(int vex, int cost) {
            this.vex = vex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge ob) {
            return Integer.compare(this.cost, ob.cost);
        }
    }
    
    static int n;
    static int m;
    static List<List<Edge>> graph;
    static int[] dis; //최소 거리를 저장하는 배열

    public static void solution(int v) {
        Queue<Edge> pQ = new PriorityQueue<>();
        pQ.offer(new Edge(v,0));
        dis[v] = 0;

        while (!pQ.isEmpty()) {
            Edge tmp = pQ.poll();
            int now = tmp.vex;
            int nowCost = tmp.cost;

            if(nowCost > dis[now]) {
                continue;
            }

            for(Edge ob : graph.get(now)) {
                if(dis[ob.vex] > nowCost + ob.cost) {
                    dis[ob.vex] = nowCost+ob.cost;
                    pQ.offer(new Edge(ob.vex, nowCost+ob.cost));
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
            graph.add(new ArrayList<>());
        }

        dis = new int[n+1];

        Arrays.fill(dis, Integer.MAX_VALUE); //거리에 최대값으로 넣어준다.

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            graph.get(a).add(new Edge(b,c));
        }

        solution(1); //1번 정점부터 시작

        for(int i = 1; i<=n ;i++) {
            if(dis[i] != Integer.MAX_VALUE) {
                System.out.println(i + " : " + dis[i]);
            } else {
                System.out.println(i + " :  impossible");
            }
        }
    }
}
