package RecursiveTreeGraph.rev;

import java.util.Scanner;

public class Main1RRRRRRRRRR {
    // 재귀함수
    public static void DFS(int n) {
        if(n == 1) {
            System.out.print(1 + " ");
        } else {
            DFS(n-1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        DFS(n);
    }
}
