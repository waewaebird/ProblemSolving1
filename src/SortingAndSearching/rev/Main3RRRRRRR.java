package SortingAndSearching.rev;

import java.util.Scanner;

public class Main3RRRRRRR {
    // 삽입 정렬
    public static int[] soltuon(int n, int[] arr) {
        for (int i = 1; i < n; i++) {
            int value = arr[i];
            int j;
            for (j = i-1; j >= 0; j--) {
                if(arr[j] > value) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j+1] = value;
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

        for(int x : soltuon(n,arr)) {
            System.out.print(x + " ");
        }
    }
}
