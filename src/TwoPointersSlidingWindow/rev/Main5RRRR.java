package TwoPointersSlidingWindow.rev;

import java.util.Scanner;

public class Main5RRRR {
    public static int solution(int n) {
        int answer = 0;

        int half = (n/2) + 1;
        int lt = 1;
        int sum = 0;
        for (int rt = 1; rt <= half; rt++) {
            sum += rt;

            if(sum >= n) {
                if(sum == n) {
                    answer++;
                }

                while(sum >= n) {
                    sum = sum - lt;
                    if(sum == n) {
                        answer++;
                    }
                    lt++;
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
