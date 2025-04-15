package RecursiveTreeGraph.rev;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main8RRRR {
    // 송아지 찾기
    public static int solution(int s, int e) {
        int[] move = {1,-1,5};
        int[] ch = new int[10001];

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(s);
        ch[s] = 1;

        int level = 0;

        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int temp = queue.poll();

                for (int j = 0; j < 3; j++) {
                    int next = temp + move[j];

                    if(next == e) {
                        return level+1;
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
