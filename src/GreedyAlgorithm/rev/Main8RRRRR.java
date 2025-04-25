package GreedyAlgorithm.rev;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main8RRRRR {
    //프림
    static class Edge implements Comparable<Edge>{
        int vex;
        int cost;

        public Edge(int vex, int cost) {
            this.vex = vex;
            this.cost = cost;
        }


        @Override
        public int compareTo(Edge o) {
            return Integer.compare(this.cost, o.cost);
        }
    }

    public static int solution(int v, int e, List<List<Edge>> list) {
        int answer = 0;
        int[] ch = new int[v+1];

        PriorityQueue<Edge> queue = new PriorityQueue<>();
        queue.offer(new Edge(1,0));

        while(!queue.isEmpty()) {
            Edge temp = queue.poll();

            int nowV = temp.vex;
            int nowC = temp.cost;

            if(ch[nowV] == 0) {
                answer += nowC;
                ch[nowV] = 1;

                for(Edge x : list.get(nowV)) {
                    if(ch[x.vex] == 0) {
                        queue.offer(new Edge(x.vex, x.cost));
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        int e = in.nextInt();

        List<List<Edge>> list = new ArrayList<>();
        for (int i = 0; i <= v; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < e; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            list.get(a).add(new Edge(b,c));
            list.get(b).add(new Edge(a,c));
        }

        System.out.println(solution(v,e,list));
    }

}
