package Array.rev;

import java.util.Scanner;

public class Main10R {
    public static int solution(int n, int[][] arr) {
        int answer = 0;
        int[] dx = {0,1,0,-1};
        int[] dy = {-1,0,1,0};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                System.out.println(arr[i][j]);
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if(nx >= 0 && nx < n  && ny >= 0 && ny < n) {
                        if(arr[nx][ny] <= arr[i][j]) {
                            flag = false;
                            break;
                        }
                    }
                }
                if(flag == true) {

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

