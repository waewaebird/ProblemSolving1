package zHackerRank._202506;

import java.util.Scanner;

public class Main_20250613_1 {

    public static int solution(String str) {
        int answer = 0;

        for (int i = 0; i < str.length(); i++) {
            if(i % 3 == 1) {
                if(str.charAt(i) != 'O') {
                    answer++;
                }
            } else {
                if(str.charAt(i) != 'S') {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();

        System.out.println(solution(str));
    }
}
