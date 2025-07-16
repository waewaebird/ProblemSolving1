package zHackerRank;

import java.util.Scanner;

public class Main_20250716_2 {
    // Flipping bits
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int q = in.nextInt();

        for (int i = 0; i < q; i++) {
            Long n = in.nextLong();


            /*long result = (~n) & 0xFFFFFFFFL;
            System.out.println(result);*/

            String temp = Long.toBinaryString(n);

            int round = 0;
            if(temp.length() < 32) {
                round = 32 - temp.length();
            }

            String zero = "";
            for (int j = 0; j < round; j++) {
                zero += "0";
            }

            String newStr = "";
            for(char x : (zero+temp).toCharArray()) {
                if(x == '1') {
                    newStr += '0';
                } else {
                    newStr += '1';
                }
            }
            System.out.println(Long.parseLong(newStr, 2));
        }
    }
}
