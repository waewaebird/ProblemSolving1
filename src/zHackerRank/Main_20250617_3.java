package zHackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_20250617_3 {
    // Funny String
    public static String solution(String str) {
        boolean flag = false;

        List<Integer> temp1 = new ArrayList<>();
        for(char x : str.toCharArray()) {
            temp1.add(Integer.valueOf(x));
        }

        List<Integer> temp2 = new ArrayList<>();
        for(char x : new StringBuilder(str).reverse().toString().toCharArray()) {
            temp2.add(Integer.valueOf(x));
        }

        for (int i = 1; i < temp1.size(); i++) {
            if(Math.abs(temp1.get(i) - temp1.get(i-1)) != Math.abs(temp2.get(i) - temp2.get(i-1)))  {
                flag = true;
            }
        }

        if(flag) {
            return "Not Funny";
        } else {
            return "Funny";
        }
    }


    public static void main(String[] args) {
        List<String> answers = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        int q = in.nextInt();

        for (int i = 0; i < q; i++) {
            String str = in.next();

            answers.add(solution(str));
        }

        for(String s : answers) {
            System.out.println(s);
        }
    }
}
