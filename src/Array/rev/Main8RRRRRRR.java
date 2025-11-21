package Array.rev;

import java.util.Scanner;

public class Main8RRRRRRR {
    public static int[] solution(int n, int[] arr) {
        int[] answers = new int[n];

        for (int i = 0; i < n; i++) {
            int cnt = 1;

            for (int j = 0; j < n; j++) {
                if(i != j) {
                    if(arr[i] < arr[j]) {
                        cnt++;
                    }
                }
            }
            answers[i] = cnt;
        }

        return answers;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for(int x : solution(n,arr)) {
            System.out.print(x + " ");
        }
    }
}
