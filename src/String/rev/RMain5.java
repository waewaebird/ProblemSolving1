package String.rev;

import java.util.Scanner;

public class RMain5 {
    public static String solution(String input) {
        int lt = 0;
        int rt = input.length()-1;

        char[] tempChars = input.toCharArray(); // 임시 배열도 이전 배열로 변환해야한다. 빈배열이 아니라

        while(lt < rt) {
            if(!Character.isAlphabetic(tempChars[lt])) {
                lt++;
            } else if(!Character.isAlphabetic(tempChars[rt])) {
                rt--;
            } else {
                char temps = input.charAt(lt);
                tempChars[lt] = input.charAt(rt);
                tempChars[rt] = temps;
                lt++;
                rt--;
            }
        }

        return String.valueOf(tempChars);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        System.out.println(solution(input));
    }
}
