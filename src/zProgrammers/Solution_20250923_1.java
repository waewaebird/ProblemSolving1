package zProgrammers;

import java.util.Scanner;

public class Solution_20250923_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        String answer = "";
        for(char x : a.toCharArray()) {
            if(Character.isAlphabetic(x)) {
                if(Character.isUpperCase(x)) {
                    answer += String.valueOf(x).toLowerCase();
                } else {
                    answer += String.valueOf(x).toUpperCase();
                }
            }
        }

        System.out.println(answer);
    }
}