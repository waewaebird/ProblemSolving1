package zHackerRank._202507;

import java.util.*;

public class Main_20250704_1 {
    //Prim's (MST) : Special Subtree
    static class Subgraph implements Comparable<Subgraph>{
        int v;
        int cost;

        public Subgraph(int v, int cost) {
            this.v = v;
            this.cost = cost;
        }

        @Override
        public int compareTo(Subgraph o) {
            return Integer.compare(this.cost, o.cost);
        }
    }

    public static Integer solution(int n, int m, List<List<Subgraph>> list, int start) {
        Integer answer = 0;

        int[] ch = new int[n+1];
        Queue<Subgraph> pq = new PriorityQueue<>();

        ch[start] = 1;
        for(Subgraph temp : list.get(start)){
            pq.offer(temp);
        }


        while(!pq.isEmpty()) {
            Subgraph now = pq.poll();

            if(ch[now.v] == 0) {
                ch[now.v] = 1;
                for(Subgraph temp : list.get(now.v)) {
                    pq.offer(temp);
                }
                answer += now.cost;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        List<List<Subgraph>> list = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            list.get(a).add(new Subgraph(b,c));
            list.get(b).add(new Subgraph(a,c));
        }

        int start = in.nextInt();

        System.out.println(solution(n,m,list,start));
    }

}
