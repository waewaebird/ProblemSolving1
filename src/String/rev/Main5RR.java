package String.rev;

import java.util.Scanner;

public class Main5RR {
    public static char[] solution(String s) {
        char[] arr = new char[s.length()];

        int lt = 0;
        int rt = s.length()-1;

        while (lt <= rt) {
            if(!Character.isAlphabetic(s.charAt(lt))) {
                arr[lt] = s.charAt(lt);
                lt++;
                continue;
            }
            if(!Character.isAlphabetic(s.charAt(rt))) {
                arr[rt] = s.charAt(rt);
                rt--;
                continue;
            }

            arr[lt] = s.charAt(rt);
            arr[rt] = s.charAt(lt);
            lt++;
            rt--;
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        for(char c : solution(s)) {
            System.out.print(c);
        }

    }
}