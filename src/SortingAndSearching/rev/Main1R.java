package SortingAndSearching.rev;

import java.util.Scanner;

public class Main1R {
    public static int[] solution(int n , int[] arr) {
        for (int i = 0; i < n-1; i++) {
            int idx = i; //가장 작은값

            for (int j = i+1; j < n; j++) {
                if(arr[j] < arr[idx]) {
                    idx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
        return arr;
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
