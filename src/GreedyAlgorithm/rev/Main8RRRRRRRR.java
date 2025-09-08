package GreedyAlgorithm.rev;

import java.util.*;

public class Main8RRRRRRRR {
    // 원더랜드(최소스패닝트리 : 프림, PriorintyQueue)
    static class City implements Comparable<City>{
        int v;
        int cost;

        public City(int v, int cost) {
            this.v = v;
            this.cost = cost;
        }

        @Override
        public int compareTo(City o) {
            return Integer.compare(this.cost, o.cost);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int v = in.nextInt();
        int e = in.nextInt();

        List<List<City>> list = new ArrayList<>();
        int[] ch = new int[v+1];

        for (int i = 0; i <= v; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < e; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            list.get(a).add(new City(b,c));
            list.get(b).add(new City(a,c));
        }

        PriorityQueue<City> pq = new PriorityQueue<>();
        pq.offer(new City(1,0));

        int answer = 0;
        while(!pq.isEmpty()) {
            City now = pq.poll(); //여기서 이미 가장 작은게 나옴

            if(ch[now.v] == 0) {
                ch[now.v] = 1;
                answer += now.cost;

                for(City obj : list.get(now.v)) {
                    pq.offer(new City(obj.v, obj.cost));
                }
            }
        }

        System.out.println(answer);
    }
}
