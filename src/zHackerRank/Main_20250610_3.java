package zHackerRank;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main_20250610_3 {
    // Marc's Cakewalk
    public static String solution(int n, Long[] arr) {
        Arrays.sort(arr, Collections.reverseOrder());
        BigDecimal sum = new BigDecimal(0);
        for (int i = 0; i < n; i++) {
            BigDecimal temp = new BigDecimal(arr[i]);
            sum = sum.add(temp.multiply(BigDecimal.valueOf(Math.pow(2,i))));
        }
        return String.valueOf(sum.setScale(0));
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        Long[] arr = new Long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextLong();
        }

        String answer = solution(n,arr);
        System.out.println(answer);
    }
}
