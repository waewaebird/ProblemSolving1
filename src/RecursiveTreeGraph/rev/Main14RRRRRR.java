package RecursiveTreeGraph.rev;

import java.util.*;

public class Main14RRRRRR {
    //그래프 최단거리
    static int N;
    static int M;
    static List<List<Integer>> graph = new ArrayList<>();
    static int[] ch;
    static int[] answers;

    public static void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(v);
        ch[v] =1;

        while(!queue.isEmpty()) {
            int temp = queue.poll();
            for(Integer next : graph.get(temp)) {
                if (ch[next] == 0) {
                    ch[next] = 1;
                    queue.offer(next);
                    answers[next] = answers[temp] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        ch = new int[N+1];
        answers = new int[N+1];

        for (int i = 0; i < M; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            graph.get(a).add(b);
        }

        BFS(1); //0번 부터 시작

        for (int i = 2; i <= N; i++) {
            System.out.println(i + " : " + answers[i]);
        }
    }
}
