package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main8RRR {
    static class City implements Comparable<City>{
        int a;
        int cost;

        public City(int a, int cost) {
            this.a = a;
            this.cost = cost;
        }
        @Override
        public int compareTo(City o) {
            return Integer.compare(this.cost, o.cost);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int V = in.nextInt();
        int E = in.nextInt();

        List<List<City>> map = new ArrayList<>();

        for (int i = 0; i <= V; i++) {
            map.add(new ArrayList<>());
        }

        int[] ch = new int[V+1];

        for (int i = 0; i < E; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            map.get(a).add(new City(b,c));
            map.get(b).add(new City(a,c));
        }

        int answer = 0;

        PriorityQueue<City> pq = new PriorityQueue<>();
        pq.offer(new City(1,0));

        while(!pq.isEmpty()) {
            City temp = pq.poll();

            int next = temp.a;

            if(ch[next] == 0) {
                ch[next] = 1;
                answer += temp.cost;

                for(City ob : map.get(next)) {
                    if(ch[ob.a] == 0) {
                        pq.offer(new City(ob.a, ob.cost));
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
