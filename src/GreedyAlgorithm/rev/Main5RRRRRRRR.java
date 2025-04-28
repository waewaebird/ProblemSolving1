package GreedyAlgorithm.rev;

import java.util.*;

public class Main5RRRRRRRR {
    static class Dijk implements Comparable<Dijk>{
        int vex;
        int cost;

        public Dijk(int vex, int cost) {
            this.vex = vex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Dijk o) {
            return Integer.compare(this.cost, o.cost);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] dis = new int[n+1];
        Arrays.fill(dis, Integer.MAX_VALUE);

        List<List<Dijk>> list = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<Dijk>());
        }

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            list.get(a).add(new Dijk(b,c));
        }

        dis[1] = 0;
        Queue<Dijk> queue = new PriorityQueue<>();
        queue.offer(new Dijk(1,0));

        while(!queue.isEmpty()) {
            Dijk temp = queue.poll();

            int nv = temp.vex;
            int nc = temp.cost;

            if(dis[nv] < nc) {
                continue;
            }

            for(Dijk obj : list.get(nv)) {
                if(dis[obj.vex] > nc + obj.cost) {
                    dis[obj.vex] = nc + obj.cost;
                    queue.offer(new Dijk(obj.vex, nc+ obj.cost));
                }
            }
        }

        for (int i = 2; i <= n ; i++) {
            if(dis[i] == Integer.MAX_VALUE) {
                System.out.println(i + " : impossible");
            } else {
                System.out.println(i + " : " + dis[i]);
            }
        }

    }

}
