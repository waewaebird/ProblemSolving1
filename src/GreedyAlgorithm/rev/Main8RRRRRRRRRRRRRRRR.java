package GreedyAlgorithm.rev;

import java.util.*;

public class Main8RRRRRRRRRRRRRRRR {
    // 원더랜드(최소스패닝트리 : 프림, PriorintyQueue)
    static class Wonder implements Comparable<Wonder> {
        int v1;
        int cost;

        public Wonder(int v1, int cost) {
            this.v1 = v1;
            this.cost = cost;
        }

        @Override
        public int compareTo(Wonder o) {
            return Integer.compare(this.cost, o.cost);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int v = in.nextInt();
        int e = in.nextInt();

        List<List<Wonder>> list = new ArrayList<>();


        int[] ch = new int[v+1];
        for (int i = 0; i <= v; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < e; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            list.get(a).add(new Wonder(b,c));
            list.get(b).add(new Wonder(a,c));
        }

        int answer = 0;

        PriorityQueue<Wonder> pq = new PriorityQueue<>();
        pq.offer(new Wonder(1,0));

        while(!pq.isEmpty()) {
            Wonder current = pq.poll();
            if(ch[current.v1] == 0) {
                ch[current.v1] = 1;
                answer += current.cost;

                for(Wonder w : list.get(current.v1)) {
                    pq.offer(new Wonder(w.v1, w.cost));
                }
            }
        }
        System.out.println(answer);
    }
}
