package Array.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main12RR {
    //멘토링
    static class Mentor {
        int a;
        int b;
        public Mentor(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }


    public static int solution(int m, int n, int[][] arr) {
        int answer = 0;
        List<Mentor> list = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    boolean flag = true;
                    for(Mentor temp : list) {
                        if(temp.a == arr[i][j] && temp.b == arr[i][k]) {
                           flag = false;
                           break;
                        }
                    }

                    if(flag) {
                        list.add(new Mentor(arr[i][j], arr[i][k]));
                    }
                }
            }
        }

        for(Mentor temp1 : list) {
            boolean flag1 = true;

            for(Mentor temp2 : list) {
                if(temp1.a == temp2.b && temp1.b == temp2.a) {

                    flag1 = false;
                    break;
                }
            }

            if(flag1) {
                answer++;
            }
        }

        return answer;
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
