package String;

import java.util.Scanner;

public class Main7 {

    public static String solution2(String str) {
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) {
            answer = "YES";
        }
        return answer;
    }

    public static String solution1(String str) {
        String answer = "YES";

        str = str.toUpperCase();

        int len = str.length();

        for(int i=0 ; i < len/2 ; i++) {
            if(str.charAt(i) != str.charAt(len-i-1)) {
                return "NO";
            }
        }
        return answer;
    }

    public static String solution(String input) {
        String answer ="NO";

        int lt = 0;
        int rt = input.length()-1;

        String low = input.toLowerCase();

        while(lt < rt){
            if(low.charAt(lt) == low.charAt(rt)){
                answer = "YES";
            } else {
                answer = "NO";
                break;
            }

            lt = lt + 1;
            rt = rt - 1;
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(solution(input));
    }

}