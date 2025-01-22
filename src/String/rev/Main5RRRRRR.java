package String.rev;

import java.util.Scanner;

public class Main5RRRRRR {
    public static char[] solution(String s) {
        char[] temp = s.toCharArray();
        char word = ' ';

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
            word = temp[lt];
            temp[lt] = temp[rt];
            temp[rt] = word;
            lt++;
            rt--;
        }


        /*System.out.println(new String(temp));*/

        return temp;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        for(char x : solution(s)) {
            System.out.print(x);
        }

    }

}
