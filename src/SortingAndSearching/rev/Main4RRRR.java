package SortingAndSearching.rev;

import java.util.Scanner;

public class Main4RRRR {
    // Least Recently Used
    public static int[] solution(int s, int n, int[] arr) {
        int[] answers = new int[s];

        for(int x : arr) {
            int loc = 0;

            for (int i = 0; i < answers.length; i++) {
                if(answers[i] == x) {
                    loc = i;
                    break;
                }
            }

            if(loc == 0) {
                for (int i = s-1; i >= 1 ; i--) {
                    answers[i] = answers[i-1];
                }
            } else {
                for (int i = loc; i >= 1 ; i--) {
                    answers[i] = answers[i-1];
                }
            }
            answers[0] = x;
        }

        return answers;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int s = in.nextInt();
        int n = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for(int a : solution(s,n,arr)) {
            System.out.print(a + " ");
        }

    }
}
