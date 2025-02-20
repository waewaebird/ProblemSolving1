package RecursiveTreeGraph.rev;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main8R {
    public static int BFSsolution(int s, int e) {
        int[] dis = {1, -1, 5};
        int[] ch = new int[10001];

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(s);

        int level =1;
        while(!queue.isEmpty()) {

            int len = queue.size();

            for (int i = 0; i < len; i++) {
                int temp = queue.poll();

                for (int j = 0; j < dis.length; j++) {
                    int number = temp + dis[j];

                    if(ch[number] == 1) {
                        continue;
                    }

                    if(number == e) {
                        return level;
                    }

                    if(number > 1 && number < 10000){
                        ch[number] = 1;
                        queue.offer(number);
                    }
                }
            }
            level++;
        }

        return -1;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int e = in.nextInt();


        System.out.println(BFSsolution(s,e));
    }
}
