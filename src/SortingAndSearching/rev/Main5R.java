package SortingAndSearching.rev;

import java.util.Arrays;
import java.util.Scanner;

public class Main5R {
    public static String solution(int n, int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if(i > 0 && arr[i] == arr[i-1]) {
                return "D";
            }
        }
        return "U";
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(n,arr));
    }
}
