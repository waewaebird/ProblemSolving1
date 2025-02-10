package SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class Main10 {
    public static int solution(int n, int c, int[] arr) {
        Arrays.sort(arr);





        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr =new int[n];

        int c = in.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(n,c,arr));
    }
}
