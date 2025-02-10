package SortingAndSearching;

import java.util.Scanner;

public class Main9 {
    public static int solution(int n, int m, int[] arr) {
        int sum = 0;
        for(int x : arr) {
            sum += x;
        }
        int mid = sum/m+1;
        int answers = 0;

        while(true) {
            int temp = 0;

            for (int rt = 0; rt < n; rt++) {
                temp += arr[rt];

                if(temp == mid) {
                    answers++;
                    temp = 0;
                } else if(temp > mid){
                    while(mid < temp) {
                        temp -= arr[rt];
                        rt--;
                        answers++;
                        temp = 0;
                    }
                } else {
                    if(rt == n-1){
                        answers++;
                    }
                }
            }

            if(answers <= m) {
                break;
            } else {
                mid++;
                answers = 0;
            }
        }

        return mid;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int m = in.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(n,m,arr));
    }
}


/*
9 3
1 2 3 4 5 6 7 8 9

5 4
1 1 1 1 1

* */