package String.rev;

import java.util.Scanner;

public class Main1RR {
    public static int solution(String input1, String input2) {
        int answer = 0;
        char c2 = input2.toLowerCase().charAt(0);

        for(char c1 : input1.toLowerCase().toCharArray()) {
            if(c1 == c2) {
                answer++;
            }
        }

        return answer;

    }




    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input1 = in.nextLine();
        String input2 = in.next();

        System.out.println(solution(input1, input2));
    }
}
