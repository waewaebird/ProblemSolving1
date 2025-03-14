package RecursiveTreeGraph.rev;

import java.util.Scanner;

public class Main2RRRR {
    public static void DFS(int v) {
        if(v == 0) {
            return;
        } else {
            DFS(v/2);
            System.out.print(v%2 + "");
        }
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        DFS(n);
    }
}
