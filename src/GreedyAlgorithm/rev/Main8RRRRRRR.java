package GreedyAlgorithm.rev;

import java.util.*;

public class Main8RRRRRRR {
    // 원더랜드(최소스패닝트리 : 프림, PriorintyQueue)
    static class Wonder implements Comparable<Wonder>{
        int v;
        int cost;

        public Wonder(int v, int cost) {
            this.v = v;
            this.cost = cost;
        }

        @Override
        public int compareTo(Wonder o) {
            return Integer.compare(this.cost, o.cost);
        }
    }

    static int V;
    static int E;
    static List<List<Wonder>> list = new ArrayList<>();

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

            list.get(a).add(new Wonder(b,c));
            list.get(b).add(new Wonder(a,c));
        }

        int[] ch = new int[V+1];

        PriorityQueue<Wonder> queue = new PriorityQueue<>();

        queue.offer(new Wonder(1,0));

        int answer = 0;
        while(!queue.isEmpty()) {
            Wonder now = queue.poll();

            if(ch[now.v] == 0) {
                ch[now.v] = 1;
                answer += now.cost;

                for(Wonder temp : list.get(now.v)) {
                    queue.offer(temp);
                }
            }
        }

        System.out.println(answer);
    }
}
