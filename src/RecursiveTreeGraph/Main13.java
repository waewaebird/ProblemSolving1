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
            for(int nv : graph.get(v)) { //v번 (ex 1번) 리스트
                if(ch[nv] == 0) { //? 방문 ?
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }
    }


    public static void main(String[] args) {
        Main13 T = new Main13();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt(); //node 갯수
        m = kb.nextInt(); //정점
        graph = new ArrayList<>();
        for (int i = 0; i <= n ; i++) {
            // 정수를 저장할 수 있는 객체 저장
            // 정점만큼 객체를 생성 한다 0,1,2,3,4,5
            graph.add(new ArrayList<>());
        }

        ch = new int[n+1]; //체크배열

        for (int i = 0; i < m; i++) {
            int a= kb.nextInt();
            int b= kb.nextInt();
            graph.get(a).add(b); //a번 List에 접근에 간선 번호를 넣어줌
        }

        ch[1] = 1; //1번노드 체크걸기
        T.DFS(1);
        System.out.println(answer);
    }

}
