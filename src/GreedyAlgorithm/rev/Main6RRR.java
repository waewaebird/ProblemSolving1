package GreedyAlgorithm.rev;

import java.util.Scanner;

public class Main6RRR {
    static int N;
    static int M;
    static int[] unf;

    public static int find(int v) {
        if(unf[v] == v) {
            return unf[v]; //집합번호 리턴
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

        N = in.nextInt();
        M = in.nextInt();

        unf = new int[N+1];

        for (int i = 0; i <= N; i++) {
            unf[i] = i;
        }

        for (int i = 0; i < M; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            union(a,b);
        }

        int ta = in.nextInt();
        int tb = in.nextInt();

        if(find(ta) != find(tb)) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }


    }
}
