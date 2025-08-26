package DfsBfs.rev;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main8RRRRRRRRRRR {
    // 수열 추측하기
    static int N;
    static int F;
    static int[] pm;
    static int[] ch;
    static boolean flag = false;

    public static void DFS(int v) {
        if(flag) {
            return;
        }

        if(v == N) {
            Deque<Integer> queue = new ArrayDeque<>();

            for(int x : pm) {
                queue.offer(x);
            }

            while(queue.size() > 1) {
                int len = queue.size();

                int now = 0;
                for (int i = 0; i < len; i++) {
                    if(i > 0) {
                        queue.offer(now + queue.peek());
                    }
                    now = queue.poll();
                }
            }

            if(queue.poll() == F) {
                for(int x : pm) {
                    System.out.print(x + " ");
                    flag = true;
                }
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
