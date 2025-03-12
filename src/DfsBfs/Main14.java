package DfsBfs;

import java.util.*;

public class Main14 {
    static int n;
    static int m;
    static int[][] map;
    static int[][] combi;
    static List<int[]> pizzaList = new ArrayList<>();
    static List<Integer> answers = new ArrayList<>();

    public static void solution(int[][] board, int[][] tempCombi) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 1) {
                    int dis = Integer.MAX_VALUE;
                    //집이면 가장 가까운 피자집과의 거리를 찾아나서라.
                    for (int[] x : tempCombi) {
                        dis = Math.min(dis, Math.abs(i - x[0]) + Math.abs(j - x[1]));
                    }

                    sum += dis;
                }

            }
        }

        answers.add(sum);
    }

    // 1. 피자집 6개중 4개를 배치하는 조합.

    public static void TempDFS(int v, int start) {
        if(v == m){

            //여기서 조합을 찾아냄
            //2. temp에 배치한다.
            int[][] temp = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(map[i][j] != 2) {
                        temp[i][j] = map[i][j];
                    }
                }
            }

            for(int[] x : combi) {
                temp[x[0]][x[1]] = 2;
            }

            //3. temp 배열에서 1번과 2번사이의 모든 거리를 구한다.
            int[][] tempCombi = combi;
            solution(temp, tempCombi);

        } else {
            for (int i = start; i < pizzaList.size(); i++) {
                combi[v] = pizzaList.get(i);
                TempDFS(v+1, i+1);
            }
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

        map = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = in.nextInt();
                if(map[i][j] == 2) {
                    pizzaList.add(new int[] {i,j});
                }
            }
        }

        combi = new int[m][];
        TempDFS(0,0);
        System.out.println(Collections.min(answers));
    }
}
