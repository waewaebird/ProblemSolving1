package String.rev;

import java.util.Scanner;

public class Main8RR {
    public static String solution(String str) {
        String answer = "YES";

        StringBuilder s = new StringBuilder();

        for(char c : str.toCharArray()) {
            if(!Character.isAlphabetic(c)) {
                s.append("");
            } else {
                s.append(c);
            }
        }

        int lt = 0;
        int rt = s.length()-1;

        String temp = s.toString().toLowerCase();


        while(lt < rt) {
            if(temp.charAt(lt) != temp.charAt(rt)){
                return "NO";
            }
            lt++;
            rt--;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(solution(input));
    }
}
