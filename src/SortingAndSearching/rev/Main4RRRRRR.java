package SortingAndSearching.rev;

import java.util.Scanner;

public class Main4RRRRRR {
    // Least Recently Used
    public static int[] solution(int s, int n, int[] arr) {
        int[] answer = new int[s];

        for(int x : arr) {
            int start = s-1;

            for (int i = 0; i < s; i++) {
                if(answer[i] == x) {
                    start = i;
                    break;
                }
            }

            for (int j = start; j >= 1; j--) {
                answer[j] = answer[j-1];
            }
            answer[0] = x;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();

        int[]arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for(int x : solution(s,n,arr)) {
            System.out.print(x + " ");
        }
    }
}
