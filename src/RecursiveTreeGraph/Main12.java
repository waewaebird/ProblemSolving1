package RecursiveTreeGraph;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Main12 {
    static int n, m, answer = 0;
    static int[][] graph;
    static int[] ch;

    public void DFS(int v){ //정점
        if(v == n) {
            answer++;
        } else {
            for (int i = 1; i <= n; i++) {
                if(graph[v][i] == 1 && ch[i] == 0) { //v지점에서 i정점까지 이동
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0;//backTracking 체크 풀어주는 시점
                }
            }
        }
    }


    public static void main(String[] args) {
        Main12 T = new Main12();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt(); //node 갯수
        m = kb.nextInt(); //정점
        graph = new int[n+1][n+1]; // 1부터 1 ~ n 번까지
        ch = new int[n+1]; //체크배열

        for (int i = 0; i < m; i++) {
            int a= kb.nextInt();
            int b= kb.nextInt();
            graph[a][b] = 1; // 방향그래프
        }

        ch[1] = 1; //1번노드 체크걸기
        T.DFS(1);
        System.out.println(answer);

    }





}
