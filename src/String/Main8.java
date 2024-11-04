package String;

import java.util.Scanner;

public class Main8 {
    public static String solution1(String s) {
        String answer ="NO";
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(s).reverse().toString();

        if(s.equals(tmp)) {
            return "YES";
        }

        return answer;
    }

    public static String solution(String input) {
        String answer ="NO";

        int lt = 0;
        int rt = input.length()-1;

        String low = input.toLowerCase();

        while(lt < rt){
            if((Character.isAlphabetic(low.charAt(lt))) && (Character.isAlphabetic(low.charAt(rt)))) {
                if(low.charAt(lt) == low.charAt(rt)){
                    answer = "YES";
                } else {
                    answer = "NO";
                    break;
                }
                lt = lt + 1;
                rt = rt - 1;
            } else if(!(Character.isAlphabetic(low.charAt(lt))) && (Character.isAlphabetic(low.charAt(rt)))) {
                lt = lt + 1;
            } else if((Character.isAlphabetic(low.charAt(lt))) && !(Character.isAlphabetic(low.charAt(rt)))) {
                rt = rt - 1;
            } else {
                lt = lt + 1;
                rt = rt - 1;
            }

        }
        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(solution(input));
    }

}
