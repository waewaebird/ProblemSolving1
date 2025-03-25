package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main7RR {
    static class City implements Comparable<City> {
        int vex1;
        int vex2;
        int cost;

        public City(int vex1, int vex2, int cost) {
            this.vex1 = vex1;
            this.vex2 = vex2;
            this.cost = cost;
        }

        @Override
        public int compareTo(City o) {
            return Integer.compare(this.cost, o.cost);
        }
    }

    static int V;
    static int E;
    static List<City> graph = new ArrayList<>();
    static int[] unf;

    public static int find(int v) {
        if(v == unf[v]) {
            return unf[v];
        } else {
            return unf[v] = find(unf[v]);
        }
    }

    public static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);

        if(fa != fb) {
            unf[fa] = fb;
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        V = in.nextInt();
        E = in.nextInt();

        unf = new int[V+1];

        for (int i = 0; i <= V ; i++) {
            unf[i] = i; // 각각의 집합으로 초기화
        }

        for (int i = 0; i < E; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            graph.add(new City(a,b,c));
        }

        Collections.sort(graph);

        int answer = 0;
        for (City c : graph) {
            int fa = find(c.vex1); //정점 1 집합번호
            int fb = find(c.vex2); //정점 2 집합번호

            if(fa != fb) { //회로 탈피
                union(fa,fb);
                answer += c.cost;
            }
        }


        System.out.println(answer);

    }
}
