package String;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main5 {
    public static String solution2(String input) {
        String answer;
        char[] s = input.toCharArray();
        int lt = 0, rt = input.length()-1;
        while (lt < rt) {
            if(!Character.isAlphabetic(s[lt])) {
                lt++;
            } else if(!Character.isAlphabetic(s[rt])) {
                rt--;
            } else{
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;

                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);
        return answer;
    }


    public static String solution(String input) {
        String output = "";
        Pattern pattern1 = Pattern.compile("[ !@#$%^&*(),.?\":{}|<>]");
        String[] answer = new String[input.length()];

        for(int i = input.length()-1 ; i > -1 ; i--) {
            if(pattern1.matcher(Character.toString(input.charAt(i))).find()) {
                answer[i] = String.valueOf(input.charAt(i));
            } else {
                for(int j = 0 ; j < answer.length ; j++) {
                    if(answer[j] == null) {
                        if(pattern1.matcher(Character.toString(input.charAt(j))).find()) {
                            continue;
                        } else{
                            answer[j] = String.valueOf(input.charAt(i));
                        }
                        break;
                    }
                }
            }
        }

        /*for(String a : answer) {
            output +=a.charAt(0);
        }*/

        return String.join("",answer);

    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(solution(input));
    }

}