package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main8RRRRRRRRRRRRR {
    // 원더랜드(최소스패닝트리 : 프림, PriorintyQueue)
    static int V;
    static int E;
    static List<List<Wonderland>> list = new ArrayList<>();

    static class Wonderland implements Comparable<Wonderland> {
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

        V = in.nextInt();
        E = in.nextInt();
        int[] ch = new int[V+1];

        for (int i = 0; i <= V; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            list.get(a).add(new Wonderland(b,c));
            list.get(b).add(new Wonderland(a,c));
        }

        PriorityQueue<Wonderland> pq = new PriorityQueue<>();
        pq.offer(new Wonderland(1,0));

        int answer = 0;
        while(!pq.isEmpty()) {
            Wonderland current = pq.poll();

            if(ch[current.v] == 0) {
                ch[current.v] = 1;
                answer += current.cost;

                for(Wonderland w : list.get(current.v)) {
                    pq.offer(w);
                }
            }
        }

        System.out.println(answer);
    }
}
