package zHackerRank._202507;

import java.util.Scanner;

public class Main_20250711_1 {
    // Caesar Cipher
    public static String solution(int n, String str, int r) {
        String answer = "";
        int number = r % 26;


        String original = str;

        int cnt = 0;
        for(char x : str.toLowerCase().toCharArray()) {
            if(Character.isAlphabetic(x)) {
                int temp = (int) x + number;

                if(temp > 122) {
                    temp = temp - 26;
                }

                if(Character.isUpperCase(original.charAt(cnt))) {
                    answer += Character.toUpperCase((char) temp);
                } else {
                    answer += (char) temp;
                }
            } else {
                answer += x;
            }

            cnt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        String str = in.next();

        int r = in.nextInt();

        System.out.println(solution(n,str,r));
    }
}
