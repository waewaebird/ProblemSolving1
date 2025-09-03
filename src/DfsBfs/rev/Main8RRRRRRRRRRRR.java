package DfsBfs.rev;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main8RRRRRRRRRRRR {
    // 수열 추측하기
    static int N;
    static int F;
    static int[] ch;
    static int[] pm;
    static boolean isEnd = false;

    public static void DFS(int v) {
        if(isEnd) {
            return;
        }

        if(v == N) {
            Deque<Integer> queue = new ArrayDeque<>();
            for(int x : pm) {
                queue.offer(x);
            }

            int temp = 0;
            while(queue.size() > 1) {
                int len = queue.size();

                for (int i = 0; i < len; i++) {
                    if(temp == 0) {
                        temp = queue.poll();
                    } else {
                        queue.offer(temp + queue.peek());
                        if(i < len ) {
                            temp = queue.poll();
                        }
                    }
                }
                temp = 0;
            }

            if(F == queue.poll()) {
                for (int x : pm) {
                    System.out.print(x + " ");
                }
                System.out.println();
                isEnd = true;
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

        ch = new int[N+1];
        pm = new int[N];

        DFS(0);
    }

}
