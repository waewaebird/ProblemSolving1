package zHackerRank;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_20250707_1 {
    // Taum and B'day
    public static BigDecimal solution(int b, int w, int bc, int wc, int z) {
        int realB = bc;
        int realW = wc;

        if(bc > wc) {
            if(bc - wc > z) {
                realB = wc+z;
            }
        } else if(bc < wc) {
            if(wc - bc > z) {
                realW = bc+z;
            }
        }

        BigDecimal bb = new BigDecimal(b);
        BigDecimal bRealB = new BigDecimal(realB);

        BigDecimal bw = new BigDecimal(w);
        BigDecimal bRealW = new BigDecimal(realW);

        BigDecimal ba = bb.multiply(bRealB);
        BigDecimal wa = bw.multiply(bRealW);
        return ba.add(wa);
    }

    public static void main(String[] args) {
        List<BigDecimal> answers = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int b = in.nextInt();
            int w = in.nextInt();

            int bc = in.nextInt();
            int wc = in.nextInt();
            int z = in.nextInt();

            answers.add(solution(b,w,bc,wc,z));
        }

        for(BigDecimal x : answers) {
            System.out.println(x);
        }
    }
}
