package SortingAndSearching.rev;

import java.util.Scanner;

public class Main3R {
    public static int[] solution(int n, int[] arr) {
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // 삽입할 값
            int j;

            for (j = i-1 ; j >= 0 ; j--) {
                if(arr[j] > key) {
                    arr[j+1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j+1] = key;
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
