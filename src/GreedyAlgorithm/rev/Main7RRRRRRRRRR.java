package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main7RRRRRRRRRR {
    // 원더랜드(최소스패닝트리 : 크루스칼, Union&Find 활용)
    static class WonderLand implements Comparable<WonderLand>{
        int start;
        int end;
        int cost;

        public WonderLand(int start, int end, int cost) {
            this.start = start;
            this.end = end;
            this.cost = cost;
        }

        @Override
        public int compareTo(WonderLand o) {
            return Integer.compare(this.cost, o.cost);
        }
    }

    public static Integer find(int v) {
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

        List<WonderLand> list = new ArrayList<>();
        unf = new int[v+1];

        for (int i = 1; i <= v; i++) {
            unf[i] = i;
        }

        for (int i = 0; i < e; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            list.add(new WonderLand(a,b,c));
        }

        list.sort(null);
        int answer = 0;

        for(WonderLand w : list) {
            int fa = find(w.start);
            int fb = find(w.end);

            if(fa != fb) {
                union(fa, fb);
                answer += w.cost;
            }
        }

        System.out.println(answer);
    }


}
