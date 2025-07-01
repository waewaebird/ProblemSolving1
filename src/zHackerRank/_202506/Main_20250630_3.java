package zHackerRank._202506;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main_20250630_3 {
    static class ForKruskal implements Comparable<ForKruskal>{
        int v1;
        int v2;
        int weight;

        public ForKruskal(int v1, int v2, int weight) {
            this.v1 = v1;
            this.v2 = v2;
            this.weight = weight;
        }

        @Override
        public int compareTo(ForKruskal o) {
            return Integer.compare(this.weight, o.weight);
        }
    }

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

    static int[] unf;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int e = in.nextInt();

        unf = new int[n+1];
        for (int i = 1; i <= n ; i++) {
            unf[i] = i;
        }

        List<ForKruskal> list = new ArrayList<>();

        for (int i = 0; i < e; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            list.add(new ForKruskal(a,b,c));
        }

        Collections.sort(list);

        int answer = 0;
        for(ForKruskal temp : list) {
            int fa = find(temp.v1);
            int fb = find(temp.v2);

            if(fa != fb) {
                union(temp.v1, temp.v2);
                answer += temp.weight;
            }
        }

        System.out.println(answer);
    }
}
