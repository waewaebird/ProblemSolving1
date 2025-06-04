package zHackerRank._202505;

import java.util.Scanner;

public class Main_20250513_1 {
    public static String solution(int x1, int v1, int x2, int v2) {
        String answer = "NO";

        int cnt = 1;

        while(true) {
            int a = x1 + (v1*cnt);
            int b = x2 + (v2*cnt);

            if(a == b) {
                answer = "YES";
                break;
            }
            cnt++;

            if(x1 < x2) {
                if(a > b) {
                    break;
                }
            }

            if(x1 > x2) {
                if(a < b) {
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();

        System.out.println(solution(x1,v1,x2,v2));
    }
}
