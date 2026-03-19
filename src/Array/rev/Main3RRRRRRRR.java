package Array.rev;

import java.util.Scanner;

public class Main3RRRRRRRR {
    // 가위 바위 보
    public static String[] solution(int n, int[] a, int[] b) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            if(a[i] == b[i]) {
                answer[i] = "D";
            } else {
                if(a[i] == 1 && b[i] ==3) {
                    answer[i] = "A";
                } else if(a[i] == 2 && b[i] == 1) {
                    answer[i] = "A";
                } else if(a[i] == 3 && b[i] == 2) {
                    answer[i] = "A";
                } else {
                    answer[i] = "B";
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }

        for(String x : solution(n,a,b)) {
            System.out.println(x);
        }
    }
}
