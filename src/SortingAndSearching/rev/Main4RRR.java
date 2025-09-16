package SortingAndSearching.rev;

import java.util.Scanner;

public class Main4RRR {
    // Least Recently Used
    public static int[] solution(int s, int n, int[] arr) {
        int[] answer = new int[s];

        for (int i = 0; i < n; i++) {
            int index = 0;
            for (int j = 0; j < s; j++) {
                if(answer[j] == arr[i]) {
                    index = j;
                    break;
                }
            }

            if(index == 0) {
                for (int j = s-1; j > 0; j--) {
                    answer[j] = answer[j-1];
                }
                answer[0] = arr[i];
            } else {
                for (int j = index; j > 0; j--) {
                    answer[j] = answer[j-1];
                }
                answer[0] = arr[i];
            }
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
