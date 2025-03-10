package RecursiveTreeGraph.rev;

import java.util.Scanner;

public class Main1RRR {
    public static void DFS(int v) {
        if(v == 0) {
            return;
        } else {
            DFS(v-1);
            System.out.print(v + " ");
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        DFS(n);
    }
}
