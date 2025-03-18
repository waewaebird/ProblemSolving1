package RecursiveTreeGraph.rev;

import java.util.Scanner;

public class Main4RRRR {
    static int[] arr;

    public static int DFS(int v) {
        if(arr[v] > 0) {
            return arr[v];
        }

        if(v == 1) {
            arr[v] = 1;
            return 1;
        } else if(v == 2) {
            arr[v] = 1;
            return 1;
        } else {
            return arr[v] = DFS(v-2) + DFS(v-1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        arr = new int[n+1];
        DFS(n);

        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
