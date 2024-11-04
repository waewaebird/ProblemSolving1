package String.rev;

import java.util.Scanner;

public class RMain1 {
    public static int solution(String input1, String input2) {
        char ic = input2.toLowerCase().charAt(0);
        int cnt = 0;

        for(char c : input1.toLowerCase().toCharArray()) {
            if(c == ic) {
                cnt++;
            }
        }
        return cnt;

    }




    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input1 = in.nextLine();
        String input2 = in.next();

        System.out.println(solution(input1, input2));
    }
}
