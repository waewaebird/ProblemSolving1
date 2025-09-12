package Array.rev;

import java.util.Scanner;

public class Main10RRRR {
    // 봉우리
    public static Integer solution(int n, int[][] arr) {
        int answer = 0;

        int[] DI = {-1,0,0,1};
        int[] DJ = {0,-1,1,0};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int totalCnt = 0;
                int cnt = 0;

                for (int k = 0; k < 4; k++) {
                    int ni = i + DI[k];
                    int nj = j + DJ[k];
                    if(ni >= 0 && ni < n && nj >=0 && nj < n) {
                        totalCnt++;
                        if(arr[i][j] > arr[ni][nj]) {
                            cnt++;
                        }
                    }
                }

                if(totalCnt == cnt) {
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
