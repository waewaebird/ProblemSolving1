package SortingAndSearching.rev;

import java.util.Scanner;

public class Main1RRR {
    // 선택정렬
    public static int[] solution(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            int idx = i;
            int min = Integer.MAX_VALUE;
            for (int j = i+1; j < n; j++) {
                if(min > arr[j]) {
                    min = arr[j];
                    idx = j;
                }
            }

            if(arr[i] > min) {
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
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
