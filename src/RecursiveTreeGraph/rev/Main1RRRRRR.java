package RecursiveTreeGraph.rev;

import java.util.Scanner;

public class Main1RRRRRR {
    // 재귀함수
    static int N;

    public static void DFS(int v) {
        if(v > N) {
            return;
        }
        System.out.print(v + " ");
        DFS(v+1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();

        DFS(1);
    }
}
