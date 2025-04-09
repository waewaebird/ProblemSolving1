package DfsBfs.rev;

import java.util.*;

public class Main15R {
    static int N;
    static int M;
    static int[][] graph;
    static List<int[]> pizzas = new ArrayList<>();
    static int[] combi;
    static List<Integer> answers = new ArrayList<>();

    public static void DFS(int v, int start) {
        if(v == M) {
            // 1. 피자집만 모으고 => pizzas
            // 2. 피자집의 조합을 만들고 => combi
            // 3. combi에 다 넣었다면 Loop돌면서 집을찾는다.(1을 찾는다)
            // 4. 집과 combi 모든 피자집을 비교하면서 가장 작은값을 찾는다. (집하나와 모든 피자집을 비교, 굳이 가장 가까운걸 미리 찾지 않아도 됨)
            // 5. 조합 하나당의 sum에 가장 작은값들을 집어 넣는다

            int sum = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if(graph[i][j] == 1) {
                        Integer min = Integer.MAX_VALUE;
                        for(int x : combi) {
                            int[] ints = pizzas.get(x);

                            min = Math.min(min,Math.abs(i - ints[0]) + Math.abs(j - ints[1]));
                        }
                        sum += min;
                    }
                }
            }

            answers.add(sum);
        } else {
            for (int i = start; i < pizzas.size(); i++) {
                combi[v] = i;
                DFS(v+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();

        graph = new int[N][N];

        M = in.nextInt();//살리고자 하는 피자집 갯수


        combi = new int[M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                graph[i][j] = in.nextInt();

                if(graph[i][j] == 2) {
                    pizzas.add(new int[] {i,j});
                }
            }
        }

        DFS(0,0);

        int answer = Integer.MAX_VALUE;

        for(int x : answers) {
            answer = Math.min(x, answer);
        }

        System.out.println(answer);
    }
}
