package Array.rev;

import java.util.Scanner;

public class Main5RR {
    public static int solution(int n) {
        int[] arr = new int[n+1];
        int cnt = 0;
        for(int i = 2 ; i <= n ; i++) {
            if(arr[i] == 0) {
                cnt++;
                for(int j = i ; j <=n ; j = j+i) {
                    arr[j] = 100;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(solution(n));
    }
}
