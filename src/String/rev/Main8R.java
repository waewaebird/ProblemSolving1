package String.rev;

import java.util.Scanner;
public class Main8R {
    public static String solution(String str) {
        String answer = "YES";

        str = str.toLowerCase();
        int lt = 0;
        int rt = str.length()-1;

        while (lt < rt) {
            if(!Character.isAlphabetic(str.charAt(lt))) {
                lt++;
            } else if (!Character.isAlphabetic(str.charAt(rt))) {
                rt--;
            } else {
                if(str.charAt(lt) != str.charAt(rt)) {
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
        String input = in.nextLine();
        System.out.println(solution(input));
    }
}
