package RecursiveTreeGraph.rev;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main8RR {
    public static int solution(int s, int e) {
        int[] dis = {1, -1, 5};
        int[] ch = new int[10001];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(s);
        ch[s] = 1;

        int jump = 0;
        while(!queue.isEmpty()) {

            int len = queue.size();

            jump++;

            for (int i = 0; i < len; i++) {
                int cv = queue.poll();
                for (int j = 0; j < dis.length; j++) {
                    int nv = cv + dis[j];

                    if(nv == e) {
                        return jump;
                    }

                    if(nv >= 1 && nv <= 10000 && ch[nv] == 0) {
                        queue.offer(nv);
                        ch[nv] = 1;
                    }
                }
            }
        }
        return jump;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int e = in.nextInt();

        System.out.println(solution(s,e));

    }
}
