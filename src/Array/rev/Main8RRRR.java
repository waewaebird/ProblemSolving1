package Array.rev;

import java.util.Scanner;

public class Main8RRRR {
    public static int[] solution(int n, int[] arr) {
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int c = 1;
            for (int j = 0; j < n; j++) {
                if(arr[i] < arr[j]) {
                    c++;
                }
            }

            answer[i] = c;
        }


        return answer;
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
