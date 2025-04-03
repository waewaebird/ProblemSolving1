package String.rev;

import java.util.Scanner;

public class Main8RRRRRRR {

    public static String solution(String str) {
        String answer = "YES";

        String temp = str.toLowerCase();

        int lt = 0;
        int rt = str.length()-1;

        while(lt<=rt) {
            if(!Character.isAlphabetic(temp.charAt(lt))) {
                lt++;
            } else if(!Character.isAlphabetic(temp.charAt(rt))) {
                rt--;
            } else {
                if(temp.charAt(lt) != temp.charAt(rt)) {
                    answer = "NO";
                    break;
                }
                lt++;
                rt--;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        System.out.println(solution(str));
    }
}
