package String.rev;

import java.util.Scanner;

public class Main4RRRR {
    // 단어 뒤집기
    public static String[] solution(int n, String[] arr) {
        String[] answers = new String[n];

        int cnt = 0;
        for(String x : arr) {
            StringBuilder sb = new StringBuilder(x);

            answers[cnt] = sb.reverse().toString();
            cnt++;
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

        for(String x : solution(n,arr)) {
            System.out.println(x);
        }
    }
}
