package Array.rev;

import java.util.Scanner;

public class Main3R {
    public static String[] solution(int n, int[] a,  int[] b) {
        String[] answer = new String[n];

        for(int i = 0 ; i < n ; i++){
            if(a[i] == b[i]) {
                answer[i] = "D";
            } else if(a[i] == 1 && b[i] == 3) {
                answer[i] = "A";
            } else if(a[i] == 2 && b[i] == 1) {
                answer[i] = "A";
            } else if(a[i] == 3 && b[i] == 2) {
                answer[i] = "A";
            } else {
                answer[i] = "B";
            }
        }

        return answer;
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for(int i =0; i < n ; i++) {
            a[i] = in.nextInt();
        }
        for(int i =0; i < n ; i++) {
            b[i] = in.nextInt();
        }

        for(String s : solution(n, a, b)) {
            System.out.println(s);
        }
    }

}
