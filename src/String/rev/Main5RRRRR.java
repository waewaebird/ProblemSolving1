package String.rev;

import java.util.Scanner;

public class Main5RRRRR {
    public static String solution(String s) {
        char[] answer = s.toCharArray();
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
            answer[lt] = s.charAt(rt);
            answer[rt] = s.charAt(lt);
            lt++;
            rt--;
        }



        return String.valueOf(answer);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(solution(s));

    }

}
