package Array;

import java.util.*;

public class Main11 {
    /*public static int solution2(int n,  int[][] arr) {
        int answer = 0, max = 0;
        for(int i =1 ; i<=n ; i++) {
            int cnt = 0;
            for(int j = 1 ; j<=n ; j++) {
                for(int k = 1 ; k <= 5 ; k++) {
                    if(arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt > max) {
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }*/


    public static int solution(int n,  int[][] arr) {
        int answer = 0;
        int max = 0;

        for(int i = 0 ; i < n ; i++) {

        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        /*int[][] arr = new int[n+1][6];

        for(int i = 1 ; i <= n ; i++) {
            for(int j = 1 ; j <= 5 ; j++) {
                arr[i][j] = in.nextInt();
            }
        }*/

        int[][] arr = new int[n][5];
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < 5 ; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(solution(n, arr));
    }
}

/*
5
9 8 7 6 5
5 6 7 8 9
1 2 3 7 8
4 5 3 4 2
6 2 8 4 2


3 5
1 2 3 4
4 5
4 5


5
9 8 7 6 5
5 6 7 8 9
1 2 3 7 8
4 5 3 4 2
6 2 8 4 2
 */

