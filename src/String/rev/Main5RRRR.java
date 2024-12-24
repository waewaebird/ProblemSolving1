package String.rev;

import java.util.Scanner;

public class Main5RRRR {
    public static String solution(String s) {
        char[] answers = s.toCharArray();

        int lt = 0;
        int rt = s.length()-1;

        while(lt < rt) {
            if(!Character.isAlphabetic(s.charAt(lt))) {
                lt++;
                continue;
            }

            if(!Character.isAlphabetic(s.charAt(rt))) {
                rt--;
                continue;
            }
            answers[lt] = s.charAt(rt);
            answers[rt] = s.charAt(lt);
            lt++;
            rt--;
        }

        return String.valueOf(answers);

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(solution(s));

    }
}