package zHackerRank;

import java.util.Scanner;

public class Main_20250609_3 {
    // Maximizing XOR
    public static int solution(int l, int r) {
        int answer = 0;
        for (int i = l; i <= r; i++) {
            for (int j = i; j <= r; j++) {
                answer = Math.max(answer, i^j);
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int l = in.nextInt();
        int r = in.nextInt();

        System.out.println(solution(l,r));
    }
}
