package SortingAndSearching;

import java.util.Scanner;

public class Main2 {
    //버블정렬
    public static int[] solution2(int n,  int[] arr) {
        for (int i = 0; i < n-1; i++) { //turn의 횟수
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }


    public static int[] solution(int n,  int[] arr) {
        while(true){
            int cnt = 0;
            for (int i = 0; i < n-1; i++) {
                if(arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    cnt++;
                }
            }
            if(cnt == 0) {
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
