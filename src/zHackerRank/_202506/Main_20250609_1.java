package zHackerRank._202506;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main_20250609_1 {
    // Fibonacci Modified
    public static String solution(int t1, int t2, int n){
        String[] arr = new String[n+1];

        arr[0] = String.valueOf(t1);
        arr[1] = String.valueOf(t2);

        for (int i = 2; i <= n ; i++) {
            //arr[i] = arr[i-2] + (arr[i-1] * arr[i-1]);
            BigDecimal bg1 = new BigDecimal(arr[i-2]);
            BigDecimal bg2 = new BigDecimal(arr[i-1]);
            BigDecimal bg3 = bg1.add(bg2.multiply(bg2));
            arr[i] = String.valueOf(bg3);
        }

        return arr[n-1];
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t1 = in.nextInt();
        int t2 = in.nextInt();

        int n = in.nextInt();

        System.out.println(solution(t1,t2,n));
    }
}
