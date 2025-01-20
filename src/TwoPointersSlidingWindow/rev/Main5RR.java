package TwoPointersSlidingWindow.rev;

import java.util.Scanner;

public class Main5RR {
    public static int solution(int n) {
        int half = n/2+2;
        int lt = 0;
        int sum = 0;
        int answer = 0;
        for (int rt = 1; rt < half; rt++) {
            sum = sum+rt;

            if(sum == n) {
                answer++;
            }

            while(sum >= n){
                sum = sum - lt;
                lt++;

                if(sum == n) {
                    answer++;
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
