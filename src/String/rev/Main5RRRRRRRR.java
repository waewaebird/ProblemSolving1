package String.rev;

import java.util.Scanner;

public class Main5RRRRRRRR {
    // 특정 문자 뒤집기
    public static String solution(String str) {
        int lt = 0;
        int rt = str.length()-1;

        char[] temp = str.toCharArray();

        while(lt <= rt) {
            if(Character.isAlphabetic(str.charAt(lt)) && Character.isAlphabetic(str.charAt(rt))) {
                temp[rt] = str.charAt(lt);
                temp[lt] = str.charAt(rt);
                lt++;
                rt--;
            } else if(!Character.isAlphabetic(str.charAt(lt)) && Character.isAlphabetic(str.charAt(rt))) {
                lt++;
            } else if(Character.isAlphabetic(str.charAt(lt)) && !Character.isAlphabetic(str.charAt(rt))) {
                rt--;
            } else {
                lt++;
                rt--;
            }
        }
        String answer = "";
        for(char x : temp) {
            answer += x;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();

        System.out.println(solution(str));
    }
}
