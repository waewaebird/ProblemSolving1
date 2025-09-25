package RecursiveTreeGraph.rev;

import java.util.*;

public class Main14RRRRRRRR {
    // 그래프 최단거리
    static int N;
    static int M;
    static List<List<Integer>> list = new ArrayList<>();
    static int[] answers;
    static int[] ch;

    public static void BFS(int v) {
        Deque<Integer> queue = new ArrayDeque<>();

        answers[v] = 0;
        queue.offer(v);

        int level = 1;
        while(!queue.isEmpty()) {
            int len = queue.size();

            for (int i = 0; i < len; i++) {
                int now = queue.poll();

                if(ch[now] == 0) {
                    for(int x : list.get(now)) {
                        answers[x] = Math.min(answers[x], level);
                        queue.offer(x);
                    }
                    ch[now] = 1;
                }

            }
            level++;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();

        answers = new int[N+1];
        Arrays.fill(answers, Integer.MAX_VALUE);

        ch = new int[N+1];
        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            list.get(a).add(b);
        }

        BFS(1);

        for (int i = 2; i <= N; i++) {
            System.out.println(i + " " + answers[i]);
        }
    }

}
