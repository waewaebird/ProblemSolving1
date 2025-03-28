package DfsBfs.rev;

import java.util.*;

public class Main8R {
    static int n;
    static int f;
    static int[] pm;
    static int[] ch;
    static boolean flag = true;

    public static void DFS(int v) {
        if(flag == false) {
            return;
        }

        if(v == n) {
            int fff = n;

            Queue<Integer> queue = new LinkedList<>();

            for (int i = 1; i < fff; i++) {
                queue.add(pm[i]+pm[i-1]);
            }

            while (queue.size() > 1) {
                int len = queue.size();

                int before = 0;

                for (int i = 0; i < len; i++) {
                    if(before > 0) {
                        queue.offer(before + queue.peek());
                    }
                    before = queue.poll();
                }
            }

            if(queue.poll() == f) {
                flag = false;
                for(int x: pm){
                    System.out.print(x + " ");
                }
            }
        } else {
            for (int i = 0; i < n ; i++) {
                if(ch[i] == 0) {
                    ch[i] = 1;
                    pm[v] = i+1;
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
        ch = new int[n];

        DFS(0);
    }
}
