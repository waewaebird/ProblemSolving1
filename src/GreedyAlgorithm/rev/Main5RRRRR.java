package GreedyAlgorithm.rev;

import java.util.*;

public class Main5RRRRR {
    //다익스트라 알고리즘
    static class Map implements Comparable<Map>{
        int vex;
        int cost;

        public Map(int vex,  int cost) {
            this.vex = vex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Map o) {
            return Integer.compare(this.cost, o.cost);
        }
    }

    static int N;
    static int M;
    static int dis[]; //1번에서 i번째 정점까지 가능 최소비용
    static List<List<Map>> graph = new ArrayList<>();

    public static void solution(int v) {
        dis[v] = 0; //1번정점으로 가는 비용은 0

        PriorityQueue<Map> queue = new PriorityQueue<>();
        queue.offer(new Map(v,0));

        while(!queue.isEmpty()) {
            Map map = queue.poll();

            int nowVex = map.vex;
            int nowCost = map.cost;

            if(dis[nowVex] < nowCost) {
                continue;
            }

            for(Map obj : graph.get(nowVex)) {
                if(dis[obj.vex] > nowCost + obj.cost) {
                    dis[obj.vex] = nowCost + obj.cost;
                    queue.offer(new Map(obj.vex, dis[obj.vex]));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        dis = new int[N+1];
        Arrays.fill(dis, Integer.MAX_VALUE);

        for (int i = 0; i < M; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            graph.get(a).add(new Map(b,c));
        }

        solution(1); //1번 정점으로 가자

        for (int i = 0; i <= N ; i++) {
            if(dis[i] != Integer.MAX_VALUE) {
                System.out.println(i + " : " + dis[i]);
            } else {
                System.out.println(i + " : impossible");
            }
        }
    }
}
