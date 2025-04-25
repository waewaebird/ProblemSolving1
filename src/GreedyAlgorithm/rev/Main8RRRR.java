package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main8RRRR {
    // 프림
    static class Wonder implements Comparable<Wonder>{
        int vex1;
        int cost;

        public Wonder(int vex1, int cost) {
            this.vex1 = vex1;
            this.cost = cost;
        }

        @Override
        public int compareTo(Wonder o) {
            return Integer.compare(this.cost,o.cost);
        }

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int V = in.nextInt();
        int E = in.nextInt();

        List<List<Wonder>> list = new ArrayList<>(); //프림은 인접리스트로 그래프 표현
        int[] ch = new int[V+1];

        for (int i = 0; i <=V ; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            list.get(a).add(new Wonder(b,c));
            list.get(b).add(new Wonder(a,c));
        }

        PriorityQueue<Wonder> queue = new PriorityQueue<>();
        queue.offer(new Wonder(1,0));

        // 회로 판단

        int answer = 0;
        while(!queue.isEmpty()) {
            Wonder temp = queue.poll();

            if(ch[temp.vex1] == 0) {
                answer += temp.cost;
                ch[temp.vex1] = 1;

                for(Wonder w : list.get(temp.vex1)) {
                    if(ch[w.vex1] == 0) {
                        queue.offer(new Wonder(w.vex1, w.cost));
                    }
                }

            }
        }

        System.out.println(answer);
    }
}
