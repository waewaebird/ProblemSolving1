package TwoPointersSlidingWindow;

import java.util.Scanner;

public class Main5 {
    public static int solution2(int n) {
        //수학적으로
        int answer = 0, cnt=1;
        n--;
        while(n>0) {
            cnt++;
            n=n-cnt;
            if(n % cnt == 0) {
                answer++;
            }
        }
        return answer;



        /*
        int answer = 0;
        int m = n/2 + 1;

        for (int i = 2; i < m; i++) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                sum += j;
            }

            if(sum <= n && (n - sum) % i == 0){
                answer++;
            }
        }
        return answer;
        */

    }



    public static int solution1(int n) {
        int answer = 0;
        int sum = 0;
        int lt = 0;
        int m = n/2+1;
        int[] arr = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = i+1;
        }

        for (int rt = 0; rt < m; rt++) {
            sum = sum + arr[rt];
            if(sum==n) {
                answer++;
            }
            while(sum >= n) {
                sum =sum - arr[lt];
                lt++;
                if(sum==n) {
                    answer++;
                }

            }

        }
        return answer;
    }

    public static int solution(int n) {
        int[] arr = new int[n+1];

        int answer = 0;

        for (int i = 1; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += j;

                if(sum == n) {
                    answer++;
                    break;
                } else if (sum > n) {
                    break;
                }
            }

            if(i >= n/2) {
                break;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println(solution2(n));
    }
}
