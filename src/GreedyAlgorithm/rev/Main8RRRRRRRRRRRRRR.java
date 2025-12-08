package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main8RRRRRRRRRRRRRR {
    // // 원더랜드(최소스패닝트리 : 프림, PriorintyQueue)
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

        int v = in.nextInt();
        int e = in.nextInt();

        List<List<Wonderland>> list = new ArrayList<>();
        for (int i = 0; i <= v; i++) {
            list.add(new ArrayList<>());
        }
        int[] ch = new int[v+1];

        for (int i = 0; i < e; i++) {
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
                answer += current.cost;
                ch[current.v] = 1;

                for(Wonderland w : list.get(current.v)) {
                    pq.offer(new Wonderland(w.v, w.cost));
                }
            }
        }

        System.out.println(answer);
    }
}
