package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main7RR {
    static class Prims implements Comparable <Prims> {
        int vex;
        int cost;

        public Prims(int vex, int cost) {
            this.vex = vex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Prims o) {
            return Integer.compare(this.cost, o.cost);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int V = in.nextInt();
        int E = in.nextInt();

        List<List<Prims>> list = new ArrayList<>();

        for (int i = 0; i <= V; i++) {
            list.add(new ArrayList<>());
        }

        int[] ch = new int[V+1];

        for (int i = 0; i < E; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            list.get(a).add(new Prims(b,c));
            list.get(b).add(new Prims(a,c));
        }

        PriorityQueue<Prims> queue = new PriorityQueue<>();

        queue.offer(new Prims(1,0));

        int answer = 0;

        while(!queue.isEmpty()) {
            Prims p = queue.poll();

            int now = p.vex;
            if(ch[now] == 0) {
                ch[now] = 1;
                answer += p.cost;

                for(Prims x : list.get(now)) {
                    if(ch[x.vex] == 0) {
                        queue.offer(new Prims(x.vex, x.cost));
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
