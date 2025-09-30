package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main6RRRRRR {
    static int[] unf;

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

    public static String solution(List<int[]> list, int find1, int find2) {
        for(int[] temp : list) {
            union(temp[0], temp[1]);
        }

        if(find(find1) == find(find2)) {
            return "YES";
        } else {
            return "NO";
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
        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            list.add(new int[] {a,b});
        }

        int find1 = in.nextInt();
        int find2 = in.nextInt();

        System.out.println(solution(list,find1,find2));
    }
}
