package zHackerRank;

import java.util.Scanner;

public class Main_20250528_1 {
    // CamelCase
    public static int solution(String str) {
        int answer = 0;
        for (int i = 0; i < str.length(); i++) {
            if(i == 0) {
                answer++;
            } else {
                if(Character.isUpperCase(str.charAt(i))) {
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
