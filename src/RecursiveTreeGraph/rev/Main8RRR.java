package RecursiveTreeGraph.rev;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main8RRR {
    //송아지 찾기
    static int S;
    static int E;
    static int[] move = new int[] {1,-1,5};
    static int[] arr = new int[10001];

    public static int BFS() {
        Queue<Integer> queue = new LinkedList<>();
        arr[S] = 1;
        queue.offer(S);

        int level = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int temp = queue.poll();

                if(temp == E) {
                    return level;
                }

                for (int j = 0; j < 3; j++) {
                    if(temp + move[j] == E) {
                        return level+1;
                    }

                    if(arr[temp + move[j]] == 0) {
                        if(temp + move[j] > 0 && temp + move[j] < 10001) {
                            arr[temp+move[j]] = 1;
                            queue.offer(temp + move[j]);
                        }
                    }
                }
            }

            level++;
        }

        return level;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        S = in.nextInt();
        E = in.nextInt();

        System.out.println(BFS());
    }
}
// 3 4356