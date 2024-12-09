package String.rev;

import java.util.Scanner;

public class Main5RRR {
    public static String solution(String input1) {
        int lt = 0;
        int rt = input1.length()-1;

        char[] arr = input1.toCharArray();

        while(lt <= rt) {
            if(!Character.isAlphabetic(input1.charAt(lt))) {
                lt++;
                continue;
            }
            if(!Character.isAlphabetic(input1.charAt(rt))) {
                rt--;
                continue;
            }
            char temp = arr[lt];
            arr[lt] = arr[rt];
            arr[rt] = temp;
            lt++;
            rt--;
        }
        return String.valueOf(arr);
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        System.out.println(solution(input));
    }
}
