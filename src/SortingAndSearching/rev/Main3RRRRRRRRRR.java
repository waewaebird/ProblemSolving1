package SortingAndSearching.rev;

import java.util.Scanner;

public class Main3RRRRRRRRRR {
    // 삽입 정렬
    public static int[] solution(int n, int[] arr) {
        for (int i = 1; i < n; i++) {
            int index = 0;
            int value = arr[i];
            for (int j = i-1; j >= 0 ; j--) {
                if(arr[j] > value) {
                    arr[j+1] = arr[j];
                } else {
                    index = j+1;
                    break;
                }
            }
            arr[index] = value;
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
