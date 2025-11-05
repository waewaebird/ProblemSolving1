package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main8RRRRRRRRRRR {
    // 원더랜드(최소스패닝트리 : 프림, PriorintyQueue)
    static class Prim implements Comparable<Prim>{
        int v;
        int cost;

        public Prim(int v, int cost) {
            this.v = v;
            this.cost = cost;
        }

        @Override
        public int compareTo(Prim o) {
            return Integer.compare(this.cost, o.cost);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int V = in.nextInt();
        int E = in.nextInt();

        int[] ch = new int[V+1];
        List<List<Prim>> list = new ArrayList<>();
        for (int i = 0; i <= V; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            list.get(a).add(new Prim(b,c));
            list.get(b).add(new Prim(a,c));
        }

        PriorityQueue<Prim> pq = new PriorityQueue<>();
        pq.offer(new Prim(1,0));

        int answer = 0;
        while (!pq.isEmpty()) {
            Prim now = pq.poll();

            if(ch[now.v] == 0) {
                ch[now.v] = 1;
                answer += now.cost;

                for(Prim p : list.get(now.v)) {
                    pq.offer(new Prim(p.v, p.cost));
                }
            }
        }

        System.out.println(answer);
    }
}
