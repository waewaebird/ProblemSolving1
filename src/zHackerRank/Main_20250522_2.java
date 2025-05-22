package zHackerRank;

import java.util.Scanner;

public class Main_20250522_2 {
    // Halloween Sale
    public static int solution(int p, int d, int m, int s) {
        int cnt = 0;
        while(s >= 0) {
            int minusPrice = p - (d * cnt);

            if(minusPrice <= m) {
                minusPrice = m;
            }

            s = s - minusPrice;

            cnt++;
        }

        return cnt-1;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int p = in.nextInt();
        int d = in.nextInt();
        int m = in.nextInt();
        int s = in.nextInt();

        System.out.println(solution(p,d,m,s));
    }
}
