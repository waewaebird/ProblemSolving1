package String.rev;

import java.util.Scanner;

public class Main8RRRR {
    public static String solution(String s) {
        int lt = 0;
        int rt = s.length()-1;

        String temp = s.toLowerCase();

        while(lt < rt) {
            if(!Character.isAlphabetic(temp.charAt(lt))) {
                lt++;
                continue;
            }
            if(!Character.isAlphabetic(temp.charAt(rt))) {
                rt--;
                continue;
            }

            if(temp.charAt(lt) != temp.charAt(rt)) {
                return "NO";
            }
            lt++;
            rt--;
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(solution(s));
    }
}
