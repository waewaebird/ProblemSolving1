package SortingAndSearching.rev;

import java.util.Scanner;

public class Main4RR {
    // Least Recently Used
    public static int[] solution(int s, int n, int[] arr) {
        int[] answers = new int[s];

        for (int i = 0; i < n; i++) {
            int cached = 0;
            int index = 0;
            for (int j = 0; j < s; j++) {
                if(arr[i] == answers[j]) {
                    cached = answers[j];
                    index = j;
                    break;
                }
            }

            if(cached > 0) {
                for (int j = index; j >=1 ; j--){
                    answers[j] = answers[j-1];
                }
            } else {
                for (int j = s-1; j >=1 ; j--){
                    answers[j] = answers[j-1];
                }
            }
            answers[0] = arr[i];
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

        for(int x : solution(s,n,arr)) {
            System.out.print(x + " ");
        }
    }
}
