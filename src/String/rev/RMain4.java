package String.rev;

import java.util.Scanner;

public class RMain4 {
    public static String[] solution(String[] input2) {
        String[] answers = new String[input2.length];

        for(int i = 0; i < answers.length ; i++) {
            StringBuilder sb = new StringBuilder(input2[i]);
            answers[i] = sb.reverse().toString();
        }

        return answers;
    }



    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();

        String[] input2 = new String[input1];

        for(int i = 0 ; i < input1 ; i++) {
            input2[i] = in.next();
        }
        String[] answer = solution(input2);

        for(String str : answer){
            System.out.println(str);
        }
    }
}
