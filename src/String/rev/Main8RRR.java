package String.rev;

import java.util.Scanner;

public class Main8RRR {
    public static String solution(String s) {
        s = s.toLowerCase();

        int lt = 0;
        int rt = s.length()-1;
        while(lt < rt) {

            if(!Character.isAlphabetic(s.charAt(lt))) {
                lt++;
                continue;
            } else if(!Character.isAlphabetic(s.charAt(rt))) {
                rt--;
                continue;
            }
            if(s.charAt(lt) != s.charAt(rt)) {
                return "NO";
            }
            lt++;
            rt--;
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        System.out.println(solution(str1));
    }
}

