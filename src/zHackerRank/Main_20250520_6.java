package zHackerRank;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main_20250520_6 {
    // Repeated String
    public static BigDecimal solution(String s, BigDecimal n) {
        int cnt = 0;

        for(char x : s.toCharArray()) {
            if(x == 'a') {
                cnt++;
            }
        }

        int len = s.length();

        BigDecimal value = n.divide(BigDecimal.valueOf(len), 0, RoundingMode.DOWN);

        BigDecimal answer = value.multiply(BigDecimal.valueOf(cnt));

        BigDecimal na = n.remainder(BigDecimal.valueOf(len));

        for (int i = 0; i < Integer.valueOf(String.valueOf(na)); i++) {
            if(s.charAt(i) == 'a') {
                answer = answer.add(BigDecimal.valueOf(1));
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.next();
        String str = in.next();

        BigDecimal n = BigDecimal.valueOf(Long.parseLong(str));

        System.out.println(solution(s,n));
    }
}
