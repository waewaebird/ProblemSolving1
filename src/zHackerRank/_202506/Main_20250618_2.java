package zHackerRank._202506;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main_20250618_2 {
    // Grid Challenge
    public static String solution(int n, String[] arr) {
        int m = 0;
        for(String x : arr) {
            m = x.length();
            break;
        }

        char[][] reals = new char[n][m];

        for (int i = 0; i < n; i++) {
            char[] temp = arr[i].toCharArray();
            Arrays.sort(temp);

            String str = "";

            for(char x: temp) {
                str += x;
            }

            for (int k = 0; k < str.length(); k++) {
                reals[i][k] = str.charAt(k);
            }
        }


        boolean flag = true;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(reals[i][j] < reals[i-1][j]) {
                    flag = false;
                    break;
                }

                if(!flag) {
                    break;
                }
            }
        }

        if(flag) {
            return "YES";
        } else{
            return "NO";
        }
    }

    public static void main(String[] args) {
        List<String> answers = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();

            String[] arr = new String[n];

            for (int j = 0; j < n; j++) {
                String s = in.next();
                arr[j] = s;
            }

            String answer = solution(n, arr);
            answers.add(answer);
        }


        for(String a : answers) {
            System.out.println(a);
        }
    }
}
