package zHackerRank;

import java.util.Scanner;

public class Main_20250520_2 {
    // Beautiful Days at the Movies
    public static int solution(int a, int b, int k) {
        int answer = 0;

        for (int i = a; i <= b ; i++) {
            StringBuilder sb = new StringBuilder(String.valueOf(i));
            Integer rn = Integer.parseInt(sb.reverse().toString());

            if(Math.abs(i - rn) % k == 0) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int k = in.nextInt();

        System.out.println(solution(a,b,k));
    }
}
