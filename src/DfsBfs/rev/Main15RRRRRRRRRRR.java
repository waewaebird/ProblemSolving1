package DfsBfs.rev;

import java.util.*;

public class Main15RRRRRRRRRRR {
    // 피자 배달 거리
    static int N;
    static int M;
    static int[][] arr;
    static List<int[]> list = new ArrayList<>();
    static Map<Integer, int[]> combi = new HashMap<>();
    static int answer = Integer.MAX_VALUE;

    public static void DFS(int v, int start) {
        if(v == M) {
            int sum = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if(arr[i][j] == 1) {
                        int min = Integer.MAX_VALUE;

                        for(int[] temp : combi.values()) {
                            min = Math.min(Math.abs(i - temp[0]) + Math.abs(j - temp[1]), min);
                        }

                        sum += min;
                    }
                }
            }

            answer = Math.min(sum, answer);
        } else {
            for (int i = start; i < list.size(); i++) {
                combi.put(v,list.get(i));
                DFS(v+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        arr = new int[N][N];
        M = in.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = in.nextInt();

                if(arr[i][j] == 2) {
                    list.add(new int[] {i,j});
                }
            }
        }

        DFS(0,0);

        System.out.println(answer);
    }
}
