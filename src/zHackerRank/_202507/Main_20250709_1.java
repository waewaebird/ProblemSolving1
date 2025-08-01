package zHackerRank._202507;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_20250709_1 {
    // Palindrome Index
    public static Integer solution(String str) {
        if(str.equals(new StringBuilder(str).reverse().toString())) {
            return -1;
        }

        int lt = 0;
        int rt = str.length()-1;
        int aTemp = 0;
        while(lt <= rt) {
            if(str.charAt(lt) == str.charAt(rt)) {
                lt++;
                rt--;
            } else {
                aTemp = lt;
                lt++;
                break;
            }
        }

        StringBuilder temp1 = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            if(i != aTemp) {
                temp1.append(str.charAt(i));
            }
        }
        if(temp1.toString().equals(new StringBuilder(temp1).reverse().toString())) {
            return aTemp;
        }

        lt = 0;
        rt = str.length()-1;
        int bTemp = 0;
        while(lt <= rt) {
            if(str.charAt(lt) == str.charAt(rt)) {
                lt++;
                rt--;
            } else {
                bTemp = rt;
                rt--;
                break;
            }
        }

        StringBuilder temp2 = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            if(i != bTemp) {
                temp2.append(str.charAt(i));
            }
        }
        if(temp2.toString().equals(new StringBuilder(temp2).reverse().toString())) {
            return bTemp;
        }

        return -1;
    }


    public static void main(String[] args) {
        List<Integer> answers = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        int q = in.nextInt();

        for (int i = 0; i < q; i++) {
            String str = in.next();

            answers.add(solution(str));
        }

        for(Integer x : answers) {
            System.out.println(x);
        }
    }
}
