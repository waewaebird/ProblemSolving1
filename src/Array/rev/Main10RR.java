package Array.rev;

import java.util.Scanner;

public class Main10RR {
    // 봉우리
    public static Integer solution(int n, int[][] arr) {
        int answer = 0;

        int[] di = {-1,0,0,1};
        int[] dj = {0,-1,1,0};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int current = arr[i][j];

                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int ni = i + di[k];
                    int nj = j + dj[k];

                    if(ni >= 0 && ni < n && nj >= 0 && nj < n){
                        if(current <= arr[ni][nj]) {
                            flag = false;
                            break;
                        }
                    }
                }
                if(flag) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(solution(n,arr));
    }
}
