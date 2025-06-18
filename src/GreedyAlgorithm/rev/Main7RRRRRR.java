package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main7RRRRRR {
    // 원더랜드(최소스패닝트리)
    static class Wonder implements Comparable<Wonder>{
        int vex1;
        int vex2;
        int cost;

        public Wonder(int vex1, int vex2, int cost) {
            this.vex1 = vex1;
            this.vex2 = vex2;
            this.cost = cost;
        }

        @Override
        public int compareTo(Wonder o) {
            return Integer.compare(this.cost, o.cost);
        }
    }

    static int V;
    static int E;
    static List<Wonder> list = new ArrayList<>();
    static int[] unf;

    public static int find(int v) {
        if(v == unf[v]) {
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

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        V = in.nextInt();
        E = in.nextInt();

        unf = new int[V+1];
        for (int i = 0; i <= V; i++) {
            unf[i] = i;
        }

        for (int i = 0; i < E; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            list.add(new Wonder(a,b,c));
        }

        Collections.sort(list);

        int answer = 0;

        for(Wonder temp : list) {
            int fa = find(temp.vex1);
            int fb = find(temp.vex2);

            if(fa != fb) {
                union(temp.vex1, temp.vex2);
                answer += temp.cost;
            }
        }

        System.out.println(answer);
    }
}
