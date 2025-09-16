package RecursiveTreeGraph.rev;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main8RRRRR {
    // 송아지 찾기 1
    public static Integer solution(int s, int e) {
        int[] moves = {1,-1,5};
        int[] ch = new int[10001];

        Deque<Integer> queue = new ArrayDeque<>();
        ch[s] = 1;
        queue.offer(s);

        boolean isFind = false;

        int level = 0;
        while(!queue.isEmpty()) {
            int len = queue.size();

            for (int i = 0; i < len; i++) {
                int now = queue.poll();

                for (int j = 0; j < 3; j++) {
                    int next = now + moves[j];

                    if(next == e) {
                        isFind = true;
                        break;
                    }

                    if(next >= 1 && next <= 10000) {
                        if(ch[next] == 0) {
                            ch[next] = 1;
                            queue.offer(next);
                        }
                    }
                }
            }
            level++;

            if(isFind) {
                break;
            }
        }
        return level;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int s = in.nextInt();
        int e = in.nextInt();

        System.out.println(solution(s,e));
    }
}
