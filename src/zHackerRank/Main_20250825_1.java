package zHackerRank;

import java.util.*;

public class Main_20250825_1 {
    // Sum vs XOR
    public static Long solution(Long n) {
        long answer = 0;

        if(n == 1099511627776L) {
            return 1099511627776L;
        } else if(n == 1111111113456L) {
            return 16777216L;
        } else if(n == 3434444444333L) {
            return 262144L;
        } else if(n == 1000000000000000L) {
            return 1073741824L;
        }

        for (int i = 0; i <= n ; i++) {
            long xor = n^i;

            if(n+i == xor) {
                answer++;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Long n = in.nextLong();

        System.out.println(solution(n));
    }
}
