package zProgrammers;

import java.util.Scanner;

public class Solution_20250929_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();

        int b_square = (int) Math.pow(c,2) - (int) Math.pow(a,2);

        System.out.println(b_square);
    }
}