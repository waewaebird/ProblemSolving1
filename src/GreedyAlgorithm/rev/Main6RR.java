package GreedyAlgorithm.rev;

import java.util.Scanner;

public class Main6RR {
    static int[] unf;
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

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        unf = new int[n+1];

        for (int i = 0; i <= n; i++) {
            unf[i] = i;
        }

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            int fa = find(a);
            int fb = find(b);

            union(fa, fb);
        }

        int ta = in.nextInt();
        int tb = in.nextInt();

        if(find(ta) == find(tb)) {
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }


    }
}
