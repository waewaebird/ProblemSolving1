package GreedyAlgorithm.rev;

import java.util.*;

public class Main8RRRRRRRRR {
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

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int v = in.nextInt();
        int e = in.nextInt();

        List<List<Prim>> list = new ArrayList<>();

        int[] visited = new int[v+1];

        for (int i = 0; i <= v; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < e; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            list.get(a).add(new Prim(b,c));
            list.get(b).add(new Prim(a,c));
        }

        PriorityQueue<Prim> pq = new PriorityQueue<>();

        pq.offer(new Prim(1,0));

        int answer = 0;

        while(!pq.isEmpty()) {
            Prim now = pq.poll();

            if(visited[now.v] == 0) {
                visited[now.v] = 1;
                answer += now.cost;

                for(Prim obj : list.get(now.v)) {
                    if(visited[obj.v] == 0) {
                        pq.offer(new Prim(obj.v, obj.cost));
                    }
                }
            }
        }


        System.out.println(answer);
    }
}
