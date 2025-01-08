package TwoPointersSlidingWindow;

import java.util.Scanner;

public class Main4 {
    //Two Ponter 문제 lt rt
    public static int solution2(int n, int m, int[] arr) {
        int answer = 0;
        int sum = 0;
        int lt = 0;

        for (int rt = 0; rt < n; rt++) {
            sum+=arr[rt];
            if(sum == m) {
                answer++;
            }
            while(sum>=m){
                sum = sum - arr[lt];
                lt++;
                if(sum==m) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static int solution(int n, int m, int[] arr) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i ; j < n; j++) {
                sum = sum+arr[j];
                if(sum == m) {
                    answer++;
                    sum = 0;
                    break;
                } else if(sum > m) {
                    sum = 0;
                    break;
                }
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution2(n,m,arr));
    }
}
