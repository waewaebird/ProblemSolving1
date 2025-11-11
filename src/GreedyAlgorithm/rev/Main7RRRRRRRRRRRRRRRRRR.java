package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main7RRRRRRRRRRRRRRRRRR {
    // 원더랜드(최소스패닝트리 : 크루스칼, Union&Find 활용)
    static class Wonder100 implements Comparable<Wonder100> {
        int v1;
        int v2;
        int cost;

        public Wonder100(int v1, int v2, int cost) {
            this.v1 = v1;
            this.v2 = v2;
            this.cost = cost;
        }

        @Override
        public int compareTo(Wonder100 o) {
            return Integer.compare(this.cost, o.cost);
        }
    }

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

    static int unf[];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int v = in.nextInt();
        int e = in.nextInt();


        List<Wonder100> list = new ArrayList<>();
        unf = new int[v+1];
        for (int i = 0; i <= v; i++) {
            unf[i] = i;
        }

        for (int i = 0; i < e; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            list.add(new Wonder100(a,b,c));
        }

        list.sort(null);
        int answer = 0;

        for(Wonder100 obj : list) {
            int fa = find(obj.v1);
            int fb = find(obj.v2);

            if(fa != fb) {
                union(obj.v1, obj.v2);
                answer += obj.cost;
            }
        }

        System.out.println(answer);
    }
}
