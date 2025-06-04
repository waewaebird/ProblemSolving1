package zHackerRank._202505;

import java.util.Scanner;

public class Main_20250513_3 {
    //Drawing Book
    public static int solution(int n, int p) {
        int a = p/2;

        long b;
        if(p%2 == 0) {
            p = p+1;
        }
        if(n%2 == 0) {
            n = n+1;
        }

        if(n-p < 2) {
            b = 0;
        } else {
            b = Math.round((double) (n-p) / 2);
        }

        //System.out.println(a + " " + b);

        int answer = Math.min(a, (int) b);
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int p = in.nextInt();

        System.out.println(solution(n,p));
    }
}
