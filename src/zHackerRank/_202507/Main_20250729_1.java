package zHackerRank._202507;

import java.util.Scanner;

public class Main_20250729_1 {
    // Strange Counter
    public static Long solution(Long n) {
        // 3 6 12 24 48 96 192
        // 1 2 4 8 16 32 64
        //10000000000000
        // 23
        Long pows = 0L;
        int group = 0;
        for (int i = 0; i <= 40 ; i++) {
            pows += (long) Math.pow(2,i) * 3;

            group = i;
            if(n <= pows) {
                break;
            }
        }

        Long answer = (long) Math.pow(2,group) * 3;
        Long nextMinIndex = pows - ((long) Math.pow(2,group) * 3) + 1;


        return answer - (n - nextMinIndex);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Long n = in.nextLong();
        System.out.println(solution(n));
    }
}
