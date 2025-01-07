package Array;

import java.util.*;


public class Main11 {

    //3중 for문
    public static int solution(int n,  int[][] arr) {
        int answer = 0;
        int max = 0;
        for(int i = 0 ; i < n ; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 5; k++) {
                    if(arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            //j for문 끝나면 i학생의 cnt 갯수가 나옴
            if(cnt > max) {
                max = cnt;
                answer= i;
            }
        }
        return answer+1; //몇번학생인지
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

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

