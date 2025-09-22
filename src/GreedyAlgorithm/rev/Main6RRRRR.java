package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main6RRRRR {
    // 친구인가?
    public static int find(int[] unf, int v) {
        if(unf[v] == v) {
            return v;
        } else {
            return unf[v] = find(unf, unf[v]);
        }
    }

    public static void union(int[] unf, int a, int b) {
        int fa = find(unf, a);
        int fb = find(unf, b);

        if(fa != fb) {
            unf[fa] = fb;
        }
    }

    public static String solution(int n, int m, List<int[]> list, int[] finds) {
        int[] unf = new int[n+1];
        for (int i = 0; i <= n; i++) {
            unf[i] = i;
        }

        for(int[] arr : list) {
            union(unf, arr[0], arr[1]);
        }

        if(find(unf, finds[0]) == find(unf, finds[1])) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            list.add(new int[] {a,b});
        }

        int fa = in.nextInt();
        int fb = in.nextInt();

        int[] finds = {fa,fb};

        System.out.println(solution(n,m,list,finds));
    }
}
