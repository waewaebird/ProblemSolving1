package DfsBfs.rev;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main8RRRRRRRRRRRRR {
    static int N;
    static int F;
    static int[] pm;
    static int[] ch;
    static boolean answer = false;

    public static void DFS(int v) {
        if(answer) {
            return;
        }

        if(v == N) {
            Queue<Integer> queue = new ArrayDeque<>();
            for (int x : pm) {
                queue.offer(x);
            }

            while(queue.size() > 1) {
                int len = queue.size();

                int now = 0;
                for (int i = 0; i < len; i++) {
                    if(i != 0) {
                        queue.offer(now + queue.peek());
                    }
                    now = queue.poll();
                }
            }

            if(F == queue.poll()) {
                for (int x : pm) {
                    System.out.print(x + " ");
                }
                System.out.println();
                answer = true;
            }
        } else {
            for (int i = 1; i <= N; i++) {
                if(ch[i] == 0) {
                    ch[i] = 1;
                    pm[v] = i;
                    DFS(v+1);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        F = in.nextInt();
        pm = new int[N];
        ch = new int[N+1];

        DFS(0);
    }
}
