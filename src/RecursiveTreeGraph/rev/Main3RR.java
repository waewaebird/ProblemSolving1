package RecursiveTreeGraph.rev;

import java.util.Scanner;

public class Main3RR {

    public static int DFS(int v) {
        if(v == 1) {
            return 1;
        } else {
            return v * DFS(v-1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println(DFS(n));

    }
}
