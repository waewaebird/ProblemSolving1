package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main7RRRRRRRR {
    // 원더랜드(최소스패닝트리 : 크루스칼, Union&Find 활용)
    static class Wonderland implements Comparable<Wonderland> {
        int v1;
        int v2;
        int cost;

        public Wonderland(int v1, int v2, int cost) {
            this.v1 = v1;
            this.v2 = v2;
            this.cost = cost;
        }

        @Override
        public int compareTo(Wonderland o) {
            return Integer.compare(this.cost, o.cost);
        }
    }


    public static int find(int v) {
        if(unf[v] == v) {
            return unf[v] = v;
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

    static int[] unf;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int v = in.nextInt();
        int e = in.nextInt();

        unf = new int[v+1];
        for (int i = 1; i <= v; i++) {
            unf[i] = i;
        }

        List<Wonderland> list = new ArrayList<>();

        for (int i = 0; i < e; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            list.add(new Wonderland(a,b,c));
        }

        int answer = 0;
        list.sort(null);
        for(Wonderland w : list) {
            int fa = find(w.v1);
            int fb = find(w.v2);

            if(fa != fb) {
                union(w.v1, w.v2);
                answer += w.cost;
            }
        }

        System.out.println(answer);
    }
}
