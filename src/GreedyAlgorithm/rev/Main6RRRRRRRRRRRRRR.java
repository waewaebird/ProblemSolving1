package GreedyAlgorithm.rev;

import java.util.Scanner;

public class Main6RRRRRRRRRRRRRR {
    // 친구인가? (Disjoint-Set : Union&Find)
    public static int find(int v) {
        if(unf[v] == v) {
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

    static int[] unf;
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

            if(find(a) != find(b)) {
                union(a,b);
            }
        }

        int x1 = in.nextInt();
        int x2 = in.nextInt();

        if(find(x1) != find(x2)) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
