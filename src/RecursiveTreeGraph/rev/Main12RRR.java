package RecursiveTreeGraph.rev;

import java.util.Scanner;

public class Main12RRR {
    static int n;
    static int m;
    static int answer;
    static int[][] graph;
    static int[] ch;

    public static void DFS(int v) {
        if(v == n) {
            answer++;
        } else {
            for (int i = 1; i <= n; i++) { //1번 노드부터 n번노드까지 체크
                if(graph[v][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    DFS(i); //v에서 i로 이동하는 것.
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();
        
        graph = new int[n+1][m+1]; // 1번 인덱스 부터 ~ N번 인덱스까지
        ch = new int[n+1];

        for (int i = 0; i < m; i++) { // 간선갯수까지 돌아야함
            int a = in.nextInt();
            int b = in.nextInt();

            graph[a][b] = 1; // a에서 b로 간다.
        }

        ch[1] = 1;
        DFS(1);

        System.out.println(answer);

    }
}
