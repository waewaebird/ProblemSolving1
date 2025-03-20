package GreedyAlgorithm;

import java.util.*;

public class Main7 {
    static class City implements Comparable <City>{
        int vex;
        int cost;

        public City(int vex, int cost) {
            this.vex = vex;
            this.cost = cost;
        }

        @Override
        public int compareTo(City o) {
            return Integer.compare(this.cost, o.cost);
        }
    }

    static int V;
    static int E;
    static List<List<City>> graph = new ArrayList<>();
    static int[] dis;
    static int[] ch;

    public static void DFS(int n) {
        if(n == V) {
            return;
        } else {
            for (int i = 1; i <= V ; i++) {
                DFS()
            }
        }
    }

    public static void solution(int n) {
        PriorityQueue<City> queue = new PriorityQueue<>();

        dis[n] = 0;
        queue.offer(new City(n,0));

        while(!queue.isEmpty()) {
            City temp = queue.poll();

            int nowCity = temp.vex;
            int nowCityCost = temp.cost;

            for (City c : graph.get(nowCity)) {
                if(dis[c.vex] > nowCityCost + c.cost) {
                    dis[c.vex] = nowCityCost + c.cost;
                    queue.offer(new City(c.vex, nowCityCost + c.cost));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        V = in.nextInt();
        E = in.nextInt();

        for (int i = 0; i <= V; i++) {
            graph.add(new ArrayList<>());
        }
        dis = new int[V+1];
        ch = new int[V+1];
        Arrays.fill(dis, Integer.MAX_VALUE);

        for (int i = 0; i < E; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            graph.get(a).add(new City(b,c));
        }

        solution(1);

        for (int x : dis) {
            System.out.print(x + " ");
        }
    }
}
