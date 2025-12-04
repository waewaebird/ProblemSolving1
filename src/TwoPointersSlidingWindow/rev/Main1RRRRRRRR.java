package TwoPointersSlidingWindow.rev;

import java.util.Scanner;

public class Main1RRRRRRRR {
    // 두 배열 합치기
    public static int[] solution(int n, int[] arr, int m , int[] arr2) {
        int[] answers = new int[n+m];

        int lt = 0;
        int rt = 0;
        int index = 0;
        while(lt < n && rt < m) {
            if(arr[lt] <= arr2[rt]) {
                answers[index] = arr[lt];
                lt++;
            } else {
                answers[index] = arr2[rt];
                rt++;
            }
            index++;
        }


        if(lt < n) {
            for (int i = lt; i < n; i++) {
                answers[index] = arr[i];
                index++;
            }
        }

        if(rt < m) {
            for (int i = rt; i < m; i++) {
                answers[index] = arr2[i];
                index++;
            }
        }



        return answers;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int m = in.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = in.nextInt();
        }

        for(int x : solution(n,arr,m,arr2)) {
            System.out.print(x + " ");
        }
    }
}
