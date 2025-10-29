package GreedyAlgorithm.rev;

import java.util.*;

public class Main8RRRRRRRRRR {
    // 원더랜드(최소스패닝트리 : 프림, PriorintyQueue)
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

        int V = in.nextInt();
        int E = in.nextInt();

        int[] ch = new int[V+1];

        List<List<Wonderland>> list = new ArrayList<>();
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

        int answer = 0;
        PriorityQueue<Wonderland> pq = new PriorityQueue<>();

        // 1번으로 가는거 0으로 먼저 넣음.
        pq.offer(new Wonderland(1,0));

        // pq 순회 돌면서
        while(!pq.isEmpty()) {

            //하나 뺴고
            Wonderland now = pq.poll();

            // 그 녀석 체크가 안돼있으면
            if(ch[now.v] == 0) {
                //체크하고
                ch[now.v] = 1;
                // 더하고
                answer += now.cost;

                for(Wonderland obj : list.get(now.v)) {
                    pq.offer(new Wonderland(obj.v, obj.cost));
                }
            }
        }

        System.out.println(answer);
    }
}
