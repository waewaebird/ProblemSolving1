package zHackerRank._202505;

import java.util.Scanner;

public class Main_20250526_1 {
    // Sequence Equation
    public static int[] solution(int n, int[] p) {
        int[] answer = new int[n+1];

        for (int x = 1; x <= n; x++) {
            int temp = 0;
            int shot = 0;

            for (int i = 0; i < n ; i++) {
                if(x == p[i]) {
                    temp = i+1;
                    for (int j = 0; j < n; j++) {
                        if(temp == p[j]) {
                            shot = j+1;
                        }
                    }
                }
            }
            answer[x] = shot;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] p = new int[n];

        for (int i = 0; i < n; i++) {
            p[i] = in.nextInt();
        }

        int[] answer = solution(n,p);
        for (int i = 1; i <= n; i++) {
            System.out.println(answer[i]);
        }
    }
}
