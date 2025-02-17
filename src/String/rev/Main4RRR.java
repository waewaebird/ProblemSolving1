package String.rev;

import java.util.Scanner;

public class Main4RRR {
    public static String[] solution(int n, String[] arr) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder(arr[i]).reverse();
            answer[i] = sb.toString();
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.next();
        }

        for(String x: solution(n, arr)) {
            System.out.println(x);
        }
    }
}
