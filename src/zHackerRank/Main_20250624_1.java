package zHackerRank;

import java.util.Scanner;

public class Main_20250624_1 {
    // Beautiful Binary String
    public static Integer solution(int n, String s) {
        s = s.replace("010", "x");

        int answer = 0;
        for(char x : s.toCharArray()) {
            if(x == 'x') {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        String s = in.next();

        System.out.println(solution(n,s));
    }
}
