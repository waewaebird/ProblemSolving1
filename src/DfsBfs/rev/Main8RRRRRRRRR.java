package DfsBfs.rev;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main8RRRRRRRRR {
    // 수열 추측하기
    static int N;
    static int F;
    static int[] pm;
    static int[] ch;
    static boolean flag = false;

    public static void DFS(int v){
        if(flag) {
            return;
        }

        if(v == N) {
            Deque<Integer> deque = new ArrayDeque<>();
            for(int x : pm) {
                deque.offer(x);
            }

            while(deque.size() > 1) {
                int len = deque.size();

                int value = 0;
                for (int i = 0; i < len; i++) {
                    if(i != 0) {
                        deque.offer(value+deque.peek());
                    }
                    value = deque.poll();
                }
            }

            if(deque.poll() == F) {
                flag = true;
                for(int x : pm) {
                    System.out.print(x + " ");
                }
                System.out.println();
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
