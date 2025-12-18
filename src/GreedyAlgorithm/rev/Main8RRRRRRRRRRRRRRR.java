package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main8RRRRRRRRRRRRRRR {
    // 원더랜드(최소스패닝트리 : 프림, PriorintyQueue)
    static class Edge implements Comparable<Edge> {
        int v;
        int cost;

        public Edge(int v, int cost) {
            this.v = v;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return Integer.compare(this.cost, o.cost);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int v = in.nextInt();
        int e = in.nextInt();

        int[] ch = new int[v+1];
        List<List<Edge>> list = new ArrayList<>();
        for (int i = 0; i <= v; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < e; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            list.get(a).add(new Edge(b,c));
            list.get(b).add(new Edge(a,c));
        }

        PriorityQueue<Edge> pq = new PriorityQueue<>();
        pq.offer(new Edge(1,0));

        int answer = 0;
        while (!pq.isEmpty()) {
            Edge current = pq.poll();

            if(ch[current.v] == 0) {
                ch[current.v] = 1;
                answer += current.cost;

                for(Edge edge : list.get(current.v)) {
                    pq.offer(new Edge(edge.v, edge.cost));
                }
            }
        }

        System.out.println(answer);
    }
}
