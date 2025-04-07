package DynamicProgramming.rev;

import java.util.Scanner;

public class Main2R {

    public static int solution(int n) {
        int[] dy = new int[n+1];

        dy[0] = 0;

        // 0 1 2 3 4 5 6 7

        // 0 1 2 3 5 8 13 21 34

        for (int i = 1; i <= n; i++) {
            if(i == 1) {
                dy[i] = 1;
            } else if(i == 2){
                dy[i] = 2;
            } else {
                dy[i] = dy[i-1] + dy[i-2];
            }
        }
        return dy[n] + dy[n-1];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(solution(n));
    }
}
