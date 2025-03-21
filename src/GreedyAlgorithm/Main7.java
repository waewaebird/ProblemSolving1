package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 그래프에서 트리를만들어내느것 :> 최소 스패닝트리
// 그래프는 회로가 존재함
// 트리는 회로가 존재 하지 않음 : 정점이 n이라면 간선은 n-1
// 크루스칼 알고리즘.
public class Main7 {
    static class Edge implements Comparable<Edge> {
        int v1;
        int v2;
        int cost;

        public Edge(int v1, int v2, int cost) {
            this.v1 = v1;
            this.v2 = v2;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return Integer.compare(this.cost, o.cost);
        }
    }

    static int unf[];
    public static int find(int v){
        if(v == unf[v]) {
            return v;
        } else {
            return unf[v] = find(unf[v]);
        }
    }

    public static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);

        if(fa != fb) {
            unf[fa] = fb;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        List<Edge> graph = new ArrayList<>();

        unf = new int[n+1];
        for (int i = 1; i <= n ; i++) {
            unf[i] = i; //초기화 각각의 집합숫자를 넣어줌
        }

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            graph.add(new Edge(a,b,c));
        }


        Collections.sort(graph);

        int answer = 0;
        for(Edge ob : graph) {
            int fv1 = find(ob.v1);
            int fv2 = find(ob.v2);

            if(fv1 != fv2) {
                answer += ob.cost;
                union(fv1, fv2);
            }
        }
        System.out.println(answer);
    }
}
