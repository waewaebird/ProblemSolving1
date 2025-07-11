package TwoPointersSlidingWindow.rev;

import java.util.Scanner;

public class Main5RRRRRR {
    // 연속된 자연수의 합
    public static Integer solution(int n) {
        int mid = n/2 + 1;

        int answer = 0;
        int temp = 0;

        int lt = 0;
        for (int rt = 1; rt <= mid; rt++) {
            temp += rt;

            if(temp >= n) {
                if(temp == n) {
                    answer++;
                }

                while(temp >= n) {
                    lt++;
                    temp = temp - lt;

                    if(temp == n) {
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
