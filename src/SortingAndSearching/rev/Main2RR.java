package SortingAndSearching.rev;

import java.util.Scanner;

public class Main2RR {
    public static int[] solution(int n, int[] arr) {
        boolean isSwap = false;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if(arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    isSwap = true;
                }
            }
            if(isSwap == false) {
                break;
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

        for (int x : solution(n,arr)) {
            System.out.print(x + " ");
        }
    }
}
