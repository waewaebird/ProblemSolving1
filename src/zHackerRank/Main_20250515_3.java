package zHackerRank;

import java.util.Scanner;

public class Main_20250515_3 {
    // Subarray Division
    public static int solution(int n, int[] arr, int d, int m) {
        int answer = 0;

        int lt = 0;
        int temp = 0;
        for (int rt = lt; rt < n; rt++) {
            temp += arr[rt];

            if(temp >= d) {
                if(temp == d) {
                    if(rt-lt+1 == m) {
                        answer++;
                    }
                }
                lt++;
                rt = lt -1 ;
                temp = 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int d = in.nextInt();
        int m = in.nextInt();

        System.out.println(solution(n,arr,d,m));
    }
}
