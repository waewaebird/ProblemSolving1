package String;

import java.util.ArrayList;
import java.util.Scanner;

public class Main4 {

    public static ArrayList<String> solution2(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length()-1;

            while (lt<rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }

            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }



    public static ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    public static String[] solution(String[] input2) {
        String[] outArr = new String[input2.length];

        for(int j = 0 ; j < input2.length ; j++) {
            String outStr ="";
            for(int i = input2[j].length()-1 ; i > -1 ; i--) {
                outStr += input2[j].charAt(i);
            }
            outArr[j] = outStr;
        }
        return outArr;
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
