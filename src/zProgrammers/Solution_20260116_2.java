package zProgrammers;

import java.util.Scanner;

public class Solution_20260116_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;

        for(int i=0; i<String.valueOf(number).length() * 2 + 1; i++){
            answer += number % 100;
            number /= 100;
        }

        System.out.println(answer);
    }
}