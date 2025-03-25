package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main8RR {
    static class City implements Comparable<City> {
        int vex;
        int cost;

        public City(int vex, int cost) {
            this.vex = vex;
            this.cost = cost;
        }

        @Override
        public int compareTo(City o) {
            return Integer.compare(this.cost, o.cost);
        }
    }

    static int V;
    static int E;
    static List<List<City>> graph = new ArrayList<>();
    static int ch[];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        V = in.nextInt();
        E = in.nextInt();

        for (int i = 0; i <= V; i++) {
            graph.add(new ArrayList<>());
        }

        ch = new int[V+1];

        for (int i = 0; i < E; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            graph.get(a).add(new City(b,c));
            graph.get(b).add(new City(a,c));
        }

        PriorityQueue<City> queue = new PriorityQueue<>();

        queue.offer(new City(1,0));

        int answer = 0;
        while (!queue.isEmpty()) {
            City temp = queue.poll();
            if(ch[temp.vex] == 0) {

                answer += temp.cost;
                ch[temp.vex] = 1;

                for(City c : graph.get(temp.vex)) {
                    if(ch[c.vex] == 0) {
                        queue.offer(new City(c.vex, c.cost));
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
