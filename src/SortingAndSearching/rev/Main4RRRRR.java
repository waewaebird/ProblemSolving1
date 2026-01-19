package SortingAndSearching.rev;

import java.util.Scanner;

public class Main4RRRRR {
    // Least Recently Used
    public static int[] solution(int s, int n, int[] arr) {
        int[] answer = new int[s];

        for (int i = 0; i < n; i++) {
            int now = arr[i];

            int number = 0;
            for (int j = 0; j < s; j++) {
                if(answer[j] == now) {
                    number = j;
                    break;
                }
            }

            if(number == 0) {
                for (int k = s-1; k >= 1; k--) {
                    answer[k] = answer[k-1];
                }
            } else {
                for (int k = number; k >= 1; k--) {
                    answer[k] = answer[k-1];
                }
            }

            answer[0] = now;
        }

        return answer;
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
