package SortingAndSearching;

import java.util.Scanner;

public class Main1 {
    //선택정렬
    public static int[] solution2(int n,  int[] arr) {
        for (int i = 0; i < n-1; i++) {
            int idx = i;

            for (int j = i+1; j < n; j++) {
                if(arr[j]<arr[idx]) {
                    idx = j;
                }
                int tmp=arr[i];
                arr[i] = arr[idx];
                arr[idx]= tmp;
            }
        }

        return arr;
    }

    public static int[] solution(int n,  int[] arr) {
        int x = 0;
        int o = 0;
        while(true) {
            int min = 200;

            for (int i = x; i < n; i++) {
                if(min > arr[i]) {
                    min = arr[i];
                    o = i;
                }
            }

            int temp = arr[x];
            arr[x] = min;
            arr[o] = temp;

            x++;

            if(x == n) {
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

        for(int x : solution(n,arr)) {
            System.out.print(x + " ");
        }

    }
}
