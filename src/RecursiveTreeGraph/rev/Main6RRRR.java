package RecursiveTreeGraph.rev;

import java.util.Scanner;

public class Main6RRRR {
    // 부분집합 구하기(DFS)
    static int N;
    static int[] sets;

    public static void DFS(int v) {
        if(v == N+1) {
            int sum = 0;
            for (int i = 1; i <= N; i++) {
                if(sets[i] == 1) {
                    sum++;
                }
            }

            if(sum > 0) {
                for (int i = 1; i <= N; i++) {
                    if(sets[i] == 1) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
            }
        } else {
            sets[v] = 1;
            DFS(v+1);
            sets[v] = 0;
            DFS(v+1);
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        sets = new int[N+1];

        DFS(1);
    }
}
