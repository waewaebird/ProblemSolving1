package String.rev;

import java.util.Scanner;

public class Main8RRRRR {
    public static String solution(String s) {
        String answer = "YES";

        int lt = 0;
        int rt = s.length()-1;

        String str = s.toLowerCase();

        while(lt < rt) {
            if(!Character.isAlphabetic(str.charAt(lt))) {
                lt++;
            } else if(!Character.isAlphabetic(str.charAt(rt))) {
                rt--;
            } else {
                if (str.charAt(lt) != str.charAt(rt)) {
                    return "NO";
                }
                lt++;
                rt--;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();

        System.out.println(solution(s));
    }
}
