package Array;

import java.util.Scanner;

public class Main10 {
    public static int solution2(int n, int[][] arr) {
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        int answer = 0;
        for(int i=0; i<n ;i++){
            for(int j=0; j<n ;j++){
                boolean flag=true;
                for(int k = 0; k < 4; k++) {
                    int nx=i+dx[k];
                    int ny=j+dy[k];
                    if(nx>=0 && nx < n && ny>= 0 && ny < n && arr[nx][ny] >= arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if(flag) {
                    answer++;
                }
            }
        }
        return answer;
    }


    public static int solution(int n , int[][] arr) {
        int answer = 0;
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < n ; j++) {
                if(j-1 < 0) {
                    //continue;
                } else {
                    if(arr[i][j-1] >= arr[i][j]) {
                        continue;
                    }
                }

                if(j+1 >= n) {
                    //continue;
                } else {
                    if(arr[i][j] <= arr[i][j+1]) {
                        continue;
                    }
                }

                if(i-1 < 0) {
                    //continue;
                } else {
                    if(arr[i-1][j] >= arr[i][j]) {
                        continue;
                    }
                }

                if(i+1 >= n) {
                    //continue;
                } else {
                    if(arr[i][j] <= arr[i+1][j]) {
                        continue;
                    }
                }
                answer = answer+1;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];

        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < n ; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(solution(n, arr));
    }
}
