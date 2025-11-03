package RecursiveTreeGraph.rev;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main8RRRRRR {
    // 송아지 찾기 1
    public static int solution(int s, int e) {
        int[] moves = new int[] {-1,1,5};
        int[] ch = new int[10001];

        Queue<Integer> queue = new ArrayDeque<>();
        ch[s] = 1;
        queue.offer(s);

        boolean flag = false;
        int answer = 0;

        while(!queue.isEmpty()) {
            int len = queue.size();

            answer++;
            for (int i = 0; i < len; i++) {
                int now = queue.poll();

                for(int x : moves) {
                    int next = now + x;

                    if(next == e) {
                        flag = true;
                        break;
                    }

                    if(next > 0 && ch[next] == 0) {
                        ch[next] = 1;
                        queue.offer(next);
                    }
                }
            }

            if(flag) {
                break;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int e = in.nextInt();

        System.out.println(solution(s,e));
    }
}
