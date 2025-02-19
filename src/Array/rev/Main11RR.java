package Array.rev;

import java.util.Scanner;

public class Main11RR {
    public static int solution(int n , int[][] arr) {
        int student = 0;
        int answer = 0;

        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 5; k++) {
                    if(arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }

            if(cnt > answer) {
                answer = cnt;
                student = i;
            }
        }

        return student+1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][5];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(solution(n,arr));
    }
}


/*

5
9 8 7 6 5
5 6 7 8 9
1 2 3 7 8
4 5 3 4 2
6 2 8 4 2


정답 :3
1 : 1
2 : 1
3 : 2
4 : 3
5 : 3







5
2 3 1 7 3
4 1 9 6 8
5 5 2 4 4
6 5 2 6 7
8 4 2 2 2










*/