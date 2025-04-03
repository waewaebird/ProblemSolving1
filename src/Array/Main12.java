package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main12 {
    static class People {
        int a;
        int b;

        public People(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    public static int solution2(int m, int n, int[][] arr) {
        int answer = 0;
        for (int i = 1; i <= n ; i++) { // 학생
            for (int j = 1; j <= n; j++) { // 학생 4 * 4 학생 경우의 수

                int cnt = 0;

                for (int k = 0; k < m; k++) { // 테스트

                    int positioni = 0; // 멘토 0등?
                    int positionj = 0; // 멘티 0등?

                    for (int l = 0; l < n; l++) { //이건 등수
                        if(arr[k][l] == i) {
                            positioni = l;
                        }

                        if(arr[k][l] == j) {
                            positionj = l;
                        }

                        if(positioni < positionj) {
                            //멘토 멘티 등수 비교
                            cnt++;
                        }
                    }
                }
                if(cnt == m) { //모든 테스테에서 앞서는지 비교 (앞서는 횟수와 테스트 횟수와 같으면)
                    answer++;
                }
            }
            return answer;
        }


        return 0;
    }

    public static int solution(int m, int n, int[][] arr) {
        List<People> possible = new ArrayList<>();

        for (int k = 1; k <= n ; k++) {
            for (int i = 0; i < m; i++) {
                boolean flag = false;
                for (int j = 0; j < n; j++) {
                    if(flag == true) {

                        boolean tempFlag = true;
                        for(People temp : possible) {
                            if(temp.a == k && temp.b == arr[i][j]) {
                                tempFlag = false;
                            }
                        }

                        if(tempFlag) {
                            possible.add(new People(k,arr[i][j]));
                        }
                    }

                    if(k == arr[i][j]) {
                        flag = true;
                    }
                }
            }
        }
        List<People> answers = new ArrayList<>();

        for(People x : possible) {
            boolean flag = true;
            for(People xx : possible) {
                if(xx.a == x.b && xx.b == x.a) {
                    flag = false;
                }
            }

            if(flag) {
                answers.add(x);
            }
        }

        /*for (People x : answers) {
            System.out.println(x.a + " : " + x.b + " ");
        }*/

        return answers.size();
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(solution(m,n,arr));
    }
}
