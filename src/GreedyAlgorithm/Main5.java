package GreedyAlgorithm;

import com.sun.tools.javac.Main;

import java.util.*;

class Edge implements Comparable<Edge> {
    // 가중치 graph 클래스
    public int vex; //정점
    public int cost; //비용(가중치 값)

    public Edge(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge ob) {
        return this.cost - ob.cost; // 오름차순
    }
}

public class Main5 {
    static int n, m;
    static ArrayList<ArrayList<Edge>> graph;
    static int[] dis; //최소 거리저장하는 배열

    public void solution(int v) {
        Queue<Edge> pQ = new PriorityQueue<>();
        pQ.offer(new Edge(v,0)); // 1, 0
        dis[v] = 0;

        while(!pQ.isEmpty()) {
            Edge tmp = pQ.poll(); //OlogN 속도로 뺀다
            int now = tmp.vex;
            int nowCost = tmp.cost;
            
            if(nowCost>dis[now]) {
                //기존에 나왔던 값
                continue;
            }

            for(Edge ob :graph.get(now)) {
                if(dis[ob.vex] > nowCost+ob.cost) {
                    dis[ob.vex] = nowCost+ob.cost;
                    pQ.offer(new Edge(ob.vex, nowCost+ob.cost));
                }
            }
        }
    }

    public static void main(String[] args) {
        Main5 T = new Main5();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        m = kb.nextInt();
        graph = new ArrayList<>(); //초기화

        for (int i = 0; i <= n ; i++) {
            graph.add(new ArrayList<Edge>()); //Edge라는 객체를 저장할 수 있는 리스트 객체를 만들어 내는것.
        }

        dis = new int[n+1];

        Arrays.fill(dis, Integer.MAX_VALUE);

        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            int c = kb.nextInt();

            graph.get(a).add(new Edge(b,c));
        }
        T.solution(1);

        for (int i = 2; i <=n; i++) {
            if(dis[i] != Integer.MAX_VALUE) {
                System.out.println(i + " : " + dis[i]);
            } else {
                System.out.println(i + " : impossible");
            }
        }
    }
}

/*
6 9
1 2 12
1 3 4
2 1 2
2 3 5
2 5 5
3 4 5
4 2 2
4 5 5
6 4 5
*/
