package zHackerRank;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main_20250520_4 {
    // Extra Long Factorials
    public static BigDecimal solution(int n) {
        BigDecimal bigDecimal = new BigDecimal(1);

        for (int i = 1; i <= n; i++) {
            bigDecimal = bigDecimal.multiply(BigDecimal.valueOf(i));
        }

        return bigDecimal;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println(solution(n));
    }
}
