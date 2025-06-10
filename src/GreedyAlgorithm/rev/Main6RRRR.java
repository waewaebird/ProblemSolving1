package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main6RRRR {
    // 친구인가? (Disjoint-Set : Union&Find)
    static int[] unf;

    public static int find(int v) {
        if(v == unf[v]) {
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


    public static String solution(int n, int m, List<int[]> friends, int f1, int f2) {
        unf = new int[n+1];

        for (int i = 1; i <= n; i++) {
            unf[i] = i;
        }

        for(int[] temp : friends) {
            int fa = find(temp[0]);
            int fb = find(temp[1]);

            if(fa != fb) {
                union(fa,fb);
            }
        }

        if(find(f1) != find(f2)) {
            return "NO";
        } else {
            return "YES";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        
        List<int[]> friends = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            friends.add(new int[] {a,b});
        }
        
        int f1 = in.nextInt();
        int f2 = in.nextInt();

        System.out.println(solution(n,m,friends,f1,f2));
    }
}
