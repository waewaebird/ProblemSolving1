package RecursiveTreeGraph.rev;

import java.util.Scanner;

public class Main2RRR {

    public static void DFS(int v) {
        if(v == 1) {
            System.out.print(v + " ");
            return;
        } else {
            int temp = v%2;
            DFS(v/2);
            System.out.print(temp + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        DFS(n);

    }
}
