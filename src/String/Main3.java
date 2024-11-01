package String;

import java.util.Scanner;

public class Main3 {
    public static String solution(String input) {
        String answers = "";
        int m = Integer.MIN_VALUE, pos;
        while((pos=input.indexOf(' '))!=-1){
            String tmp = answers.substring(0, pos);
            int len = tmp.length();
            if(len>m) {
                m = len;
                answers = tmp;
            }
            input = input.substring(pos+1);
        }
        if(input.length()>m) answers = input;

        String[] s = input.split(" ");
        for(String x : s) {
            int len =x.length();
            if(len > m) {
                m=len;
                answers = x;
            }
        }

        String answerss = "";
        String[] inputArr = input.split(" ");

        for(int i = 0; i < inputArr.length ; i++) {
            if(i == 0) {
                answerss = inputArr[i];
            } else {
                if(answerss.length() < inputArr[i].length()) {
                    answerss = inputArr[i];
                }
            }
        }
        return answerss;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input = in.nextLine();

        System.out.println(solution(input));
    }
}
