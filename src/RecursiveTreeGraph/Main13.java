package RecursiveTreeGraph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main13 {
    static int n, m, answer = 0;
    static List<List<Integer>> graph;
    static int[] ch;

    public void DFS(int v){ //정점
        if(v == n) {
            answer++;
        } else {
            for(int nv : graph.get(v)) {
                if(ch[nv] == 0) {
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }
    }


    public static void main(String[] args) {
        Main12 T = new Main12();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt(); //node 갯수
        m = kb.nextInt(); //정점
        graph = new ArrayList<>(); // 1부터 1 ~ n 번까지
        for (int i = 0; i <= n ; i++) {
            graph.add(new ArrayList<>());
        }

        ch = new int[n+1]; //체크배열

        for (int i = 0; i < n; i++) {
            int a= kb.nextInt();
            int b= kb.nextInt();
            graph.get(a).add(b);
        }

        ch[1] = 1; //1번노드 체크걸기
        T.DFS(1);
        System.out.println(answer);

    }

}
