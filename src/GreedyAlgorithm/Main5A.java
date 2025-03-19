package GreedyAlgorithm;

import java.util.*;

public class Main5A {
    static class Edge implements Comparable<Edge>{
        int vex; // 방향
        int cost; // 비용

        public Edge(int vex, int cost) {
            this.vex = vex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge ob) {
            return Integer.compare(this.cost, ob.cost);
        }// 오름차순 정렬은 => 가장 작은값을 우선 꺼내라
    }
    
    static int n;
    static int m;
    static List<List<Edge>> graph;
    static int[] dis; //최소 거리를 저장하는 배열 , ex: 1번정점에서 3번정점까지 가는것

    public static void solution(int v) {
        Queue<Edge> pQ = new PriorityQueue<>();
        pQ.offer(new Edge(v,0)); // Edge객체( 1번정점까지 가는데 비용은 0이다. )
        dis[v] = 0; // 1번에서 1번은 무조건 0이지

        while (!pQ.isEmpty()) {
            Edge tmp = pQ.poll(); //가장 작은 값을 뽑아온다. PriorityQueue니깐...
            int now = tmp.vex;
            int nowCost = tmp.cost;

            if(nowCost > dis[now]) {
                continue;
            }

            for(Edge ob : graph.get(now)) { //now와 연결된 ArrayList에 있는 Edge객체들 foreach
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

        graph = new ArrayList<>(); // new ArrayList<ArrayList<Edge>>();

        for (int i = 0; i <= n; i++) {
            // 0번객체, 1번객체 ... n번까지의 객체 생성.
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
