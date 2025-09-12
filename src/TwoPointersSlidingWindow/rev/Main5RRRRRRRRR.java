package TwoPointersSlidingWindow.rev;

import java.util.Scanner;

public class Main5RRRRRRRRR {
    // 연속된 자연수의 합
    public static Integer solution(int n) {
        int answer = 0;

        int lt = 1;
        int sum = 0;
        for (int i = 1; i <= n/2+1; i++) {
            sum += i;

            if(sum >= n) {
                if(sum == n) {
                    answer++;
                }

                while(sum >= n) {
                    sum = sum-lt;
                    lt++;

                    if(sum == n) {
                        answer++;
                    }
                }
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
