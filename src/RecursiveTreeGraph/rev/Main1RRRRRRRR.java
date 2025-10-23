package RecursiveTreeGraph.rev;

import java.util.Scanner;

public class Main1RRRRRRRR {
    // 재귀함수
    public static void DFS(int v) {
        if(v == 1) {
            System.out.print(1 + " ");
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
