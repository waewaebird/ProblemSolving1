package RecursiveTreeGraph.rev;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main8RRRRRRR {
    // 송아지 찾기 1
    public static int solution(int s, int e) {
        int[] arr = new int[10001];

        int[] moves = {1,-1,5};

        Queue<Integer> queue = new ArrayDeque<>();
        arr[s] = 1;
        queue.offer(s);

        int answer = 0;
        int level = 0;

        while(!queue.isEmpty()) {
            int len = queue.size();

            level++;
            for (int i = 0; i < len; i++) {
                int now = queue.poll();

                for (int j = 0; j < 3; j++) {
                    int next = now + moves[j];

                    if(next == e) {
                        answer = level;
                        break;
                    }

                    if(next >= 0 && next < 10001) {
                        if(arr[next] == 0) {
                            arr[next] = 1;
                            queue.offer(next);
                        }
                    }
                }

                if(answer != 0) {
                    break;
                }
            }

            if(answer != 0) {
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
