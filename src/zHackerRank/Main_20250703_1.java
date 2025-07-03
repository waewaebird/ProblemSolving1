package zHackerRank;

import java.util.Scanner;

public class Main_20250703_1 {
    // Jumping on the Clouds
    public static int solution(int n, int[] arr) {
        int jump = 0;
        int now = 0;
        while (now < n-1) {
            if(now + 2 <= n-1) {
                if(arr[now+2] == 1){
                    now = now + 1;
                } else {
                    now = now + 2;
                }
                jump++;
            } else if(now + 1 == n-1) {
                now = now + 1;
                jump++;
            }
        }

        return jump;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(n,arr));
    }
}
