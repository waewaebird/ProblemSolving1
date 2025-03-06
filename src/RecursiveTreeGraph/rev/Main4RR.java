package RecursiveTreeGraph.rev;

import java.util.Scanner;

public class Main4RR {
    static int n;
    static int[] fibo;

    public static int DFS(int v) {
        if(fibo[v] >= 1) {
            return fibo[v];
        }

        if(v == 1) {
            return fibo[v] = 1;
        } else if (v == 2) {
            return fibo[v] = 1;
        } else {
            return fibo[v] = DFS(v-2) + DFS(v-1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();

        fibo = new int[n+1];

        DFS(n);

        for (int i = 1; i <= n; i++) {
            System.out.print(fibo[i] + " ");
        }

    }
}
