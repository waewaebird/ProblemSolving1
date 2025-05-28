package String.rev;

import java.util.Scanner;

public class Main3RRRR {
    // 문장 속 단어
    public static String solution(String str) {
        String[] arr = str.split(" ");

        String answer = "";
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length() > max) {
                answer = arr[i];
                max = arr[i].length();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        System.out.println(solution(str));
    }
}
