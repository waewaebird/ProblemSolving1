package SortingAndSearching;

import java.util.Scanner;

public class Main3 {
    public static int[] solution2(int n, int[] arr) {
        for (int i = 1; i < n; i++) {
            int tmp = arr[i], j;
            for(j = i=1; j >= 0 ; j--){
                if(arr[j] > tmp ){
                    arr[j+1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j+1] = tmp;
        }



        return arr;
    }

    public static int[] solution(int n, int[] arr) {
        // 0j  1i

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[i]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;

                } else if(arr[j] < arr[i]) {
                    arr[j] = arr[j];
                    arr[i] = arr[i];
                }
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
