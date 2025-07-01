package zHackerRank._202506;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main_20250604_1 {
    // Recursive Digit Sum
    public static String DFS(String p) {
        if(p.length() == 1) {
            return p;
        } else {
            BigDecimal sum = new BigDecimal(0);
            for(char x : p.toCharArray()) {
                sum = sum.add(BigDecimal.valueOf(Long.parseLong(String.valueOf(x))));
            }
            return DFS(String.valueOf(sum));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String n = in.next();
        int k = in.nextInt();

        BigDecimal sum = new BigDecimal(0);
        for(char x : n.toCharArray()) {
            sum = sum.add(BigDecimal.valueOf(Long.parseLong(String.valueOf(x))));
        }

        sum = sum.multiply(BigDecimal.valueOf(k));

        System.out.println(DFS(sum.toString()));
    }

}
