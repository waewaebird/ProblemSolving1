package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main8RRRRRR {
    // 원더랜드(최소스패닝트리 : 프림, PriorintyQueue)
    static class Prim implements Comparable<Prim> {
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

    static int V;
    static int E;
    static List<List<Prim>> list = new ArrayList<>();

    public static Integer solution() {
        int[] ch = new int[V+1];

        int answer = 0;
        PriorityQueue<Prim> pq = new PriorityQueue<>();
        pq.offer(new Prim(1,0));


        while(!pq.isEmpty()) {
            Prim temp = pq.poll();

            if(ch[temp.v] == 0) {
                ch[temp.v] = 1;
                answer += temp.cost;

                for(Prim obj : list.get(temp.v)) {
                    if(ch[obj.v] == 0) {
                        pq.offer(new Prim(obj.v, obj.cost));
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        V = in.nextInt();
        E = in.nextInt();

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

        System.out.println(solution());
    }

}
