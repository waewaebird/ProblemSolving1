package RecursiveTreeGraph.rev;

import java.util.Scanner;

public class Main6RRRRR {
    // 부분집합 구하기(DFS)
    static int N;
    static int[] arr;

    public static void DFS(int v) {
        if(v > N) {
            for (int i = 1; i <= N; i++) {
                if(arr[i] > 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        } else {
            arr[v] = 1;
            DFS(v+1);
            arr[v] = 0;
            DFS(v+1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        arr = new int[N+1];

        DFS(1);
    }
}
