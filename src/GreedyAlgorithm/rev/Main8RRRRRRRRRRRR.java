package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main8RRRRRRRRRRRR {
    // 원더랜드(최소스패닝트리 : 프림, PriorintyQueue)
    static class Wonderland implements Comparable<Wonderland>{
        int v;
        int cost;

        public Wonderland(int v, int cost) {
            this.v = v;
            this.cost = cost;
        }

        @Override
        public int compareTo(Wonderland o) {
            return Integer.compare(this.cost, o.cost);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        int e = in.nextInt();

        int[] ch = new int[v+1];
        List<List<Wonderland>> list = new ArrayList<>();

        for (int i = 0; i <= v; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < e; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            list.get(a).add(new Wonderland(b,c));
            list.get(b).add(new Wonderland(a,c));
        }

        PriorityQueue<Wonderland> pq = new PriorityQueue<>();
        pq.offer(new Wonderland(1, 0));

        int answer = 0;
        while (!pq.isEmpty()) {
            Wonderland now = pq.poll();

            if(ch[now.v] == 0) {
                ch[now.v] = 1;
                answer += now.cost;

                for(Wonderland w : list.get(now.v)) {
                    pq.offer(w);
                }
            }
        }
        System.out.println(answer);
    }
}
