package RecursiveTreeGraph.rev;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main8RRRRRRRR {
    // 송아지 찾기 1
    public static int solution(int s, int e) {
        int[] ch = new int[10001];
        int[] m = {-1,1,5};

        ch[1] = 1;
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(s);

        int answer = 0;
        int jump = 0;
        while(!queue.isEmpty()) {
            if(answer != 0) {
                break;
            }
            int len = queue.size();

            jump++;
            for (int i = 0; i < len; i++) {
                if(answer != 0) {
                    break;
                }

                int now = queue.poll();

                for (int j = 0; j < 3; j++) {
                    int next = now + m[j];

                    if(next == e) {
                        answer = jump;
                        break;
                    }

                    if(next > 0 && ch[next] == 0) {
                        ch[next] = 1;
                        queue.offer(next);
                    }
                }
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
