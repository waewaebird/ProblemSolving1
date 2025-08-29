package SortingAndSearching.rev;

import java.util.Scanner;

public class Main1RRRRRRRR {
    // 선택 정렬
    public static int[] solution(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            int index = i;
            for (int j = i+1; j < n; j++) {
                if(arr[index] > arr[j]) {
                    index = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
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
