package String;

import java.util.Scanner;

public class Main1 {
    public static int solution(String input1, String input2) {
        int answer = 0;

        char input2c = input2.toLowerCase().charAt(0);

        input1 = input1.toLowerCase();

        for(int i = 0; i < input1.length(); i++) {
            if(input1.charAt(i) == input2c) {
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
