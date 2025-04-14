package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main7RRR {
    static class WonderLand implements Comparable<WonderLand> {
        int a;
        int b;
        int cost;

        public WonderLand(int a, int b, int cost) {
            this.a = a;
            this.b = b;
            this.cost = cost;
        }

        @Override
        public int compareTo(WonderLand o) {
            return Integer.compare(this.cost, o.cost);
        }
    }

    public static int find(int v) {
        if(unf[v] == v) {
            return v;
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

    static int V;
    static int E;
    static List<WonderLand> list = new ArrayList<>();
    static int unf[];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        V = in.nextInt();
        E = in.nextInt();

        unf = new int[V+1];

        for (int i = 1; i <=V; i++) {
            unf[i] = i;
        }

        for (int i = 0; i < E; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            list.add(new WonderLand(a,b,c));
        }

        Collections.sort(list);

        int answer = 0;
        for(WonderLand x : list) {
            int at = find(x.a);
            int bt = find(x.b);

            if(at != bt) {
                union(at,bt);
                answer += x.cost;
            }
        }

        System.out.println(answer);
    }
}

