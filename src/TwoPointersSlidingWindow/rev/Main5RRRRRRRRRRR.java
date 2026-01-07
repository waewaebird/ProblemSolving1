package TwoPointersSlidingWindow.rev;

import java.util.Scanner;

public class Main5RRRRRRRRRRR {
    // 연속된 자연수의 합
    public static int solution(int n) {
        int answer = 0;
        int sum = 0;

        int left = 1;
        for (int i = 1; i <= n/2+1; i++) {
            sum += i;

            while(sum >= n) {
                if(sum == n) {
                    answer++;
                }

                sum -= left;
                left++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(solution(n));
    }
}
