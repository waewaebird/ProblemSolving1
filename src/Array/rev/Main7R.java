package Array.rev;

import java.util.Scanner;

public class Main7R {
    public static int solution(int n , int[] arr) {
        int answer = 0;

        int cnt = 0;
        for(int i = 0; i < n ; i++) {
            if(arr[i] > 0) {
                cnt++;
            } else {
                cnt = 0;
            }
            answer += cnt;
        }


        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(n, arr));

    }

}

/*
10
1 0 1 1 1 0 0 1 1 0

10
0 1 0 0 1 0 1 1 0 0
* */