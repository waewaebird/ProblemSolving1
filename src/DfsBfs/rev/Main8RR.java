package DfsBfs.rev;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main8RR {
    static int n;
    static int f;
    static int[] pm;
    static int[] ch;
    static boolean flag = false;

    public static void DFS(int v) {
        if(flag == true) {
            return;
        }

        if(v == n) {
            Queue<Integer> queue = new LinkedList<>();
            for (int i = 1; i < n; i++) {
                queue.offer(pm[i] + pm[i-1]);
            }

            while(queue.size() > 1) {
                int temp = 0;
                int len = queue.size();
                for (int i = 0; i < len; i++) {
                    if(temp == 0){
                        temp = queue.poll();
                    } else {
                        queue.offer(temp + queue.peek());
                        temp = queue.poll();
                    }
                }
            }

            int temp = 0;
            while(queue.size() > 1) {
                if(temp == 0){
                    temp = queue.poll();
                } else {
                    queue.offer(temp + queue.peek());
                    temp = queue.poll();
                }
            }

            if(queue.poll() == f) {
                for(int x : pm) {
                    System.out.print(x + " ");
                }
                flag = true;
            }
        } else {
            for (int i = 1; i <= n; i++) {
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
        n = in.nextInt();
        f = in.nextInt();

        pm = new int[n];
        ch = new int[n+1];

        DFS(0);


    }
}
