package String.rev;

import java.util.Scanner;

public class Main4RR {
    public static String[] solution(int n , String[] arr) {
        String[] answers = new String[n];

        for (int i = 0; i < n; i++) {
            answers[i] = new StringBuilder(arr[i]).reverse().toString();
        }

        return answers;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.next();
        }

        for(String a : solution(n,arr)) {
            System.out.println(a);
        }


    }
}
