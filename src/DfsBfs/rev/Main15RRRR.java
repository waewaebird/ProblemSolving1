package DfsBfs.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main15RRRR {
    //피자 배달 거리
    static int N;
    static int M;
    static int[][] arr;
    static List<int[]> pizzas = new ArrayList<>();
    static int[] combi;
    static int answer = Integer.MAX_VALUE;

    public static void DFS(int v, int start) {
        if(v == M) {
            int sum = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if(arr[i][j] == 1) {
                        int dis = Integer.MAX_VALUE;
                        for(int x : combi){
                            int[] temp = pizzas.get(x);
                            dis = Math.min(dis, Math.abs(i-temp[0]) + Math.abs(j-temp[1]));
                        }
                        sum += dis;
                    }
                }
            }
            answer = Math.min(answer, sum);
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
        arr = new int[N][N];

        M = in.nextInt();
        combi = new int[M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = in.nextInt();

                if(arr[i][j] == 2) {
                    pizzas.add(new int[] {i,j});
                }
            }
        }

        DFS(0,0);

        System.out.println(answer);
    }



}
