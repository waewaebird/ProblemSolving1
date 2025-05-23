package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main7RRRRR {
    // 원더랜드(최소스패닝트리 : 크루스칼, Union&Find 활용)
    static class WonderLand implements Comparable<WonderLand> {
        int vex1;
        int vex2;
        int cost;

        public WonderLand(int vex1, int vex2, int cost) {
            this.vex1 = vex1;
            this.vex2 = vex2;
            this.cost = cost;
        }

        @Override
        public int compareTo(WonderLand o) {
            return Integer.compare(this.cost, o.cost);
        }
    }
    static int V;
    static int E;
    static List<WonderLand> list = new ArrayList<>();
    static int[] unf;

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
            unf[fa] = find(fb);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        V = in.nextInt();
        E = in.nextInt();

        unf = new int[V+1];

        for (int i = 1; i <= V; i++) {
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

        for(WonderLand wonderLand : list) {
            int fa = find(wonderLand.vex1);
            int fb = find(wonderLand.vex2);

            if(fa != fb) {
                union(fa,fb);
                answer +=  wonderLand.cost;
            }
        }

        System.out.println(answer);
    }
}
