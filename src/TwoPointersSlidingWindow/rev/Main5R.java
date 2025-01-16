package TwoPointersSlidingWindow.rev;

import java.util.Scanner;

public class Main5R {
    public static int solution(int n) {
        int half = (n / 2) + 2;

        int answer = 0;
        int temp = 0;

        int lt = 1;
        for (int rt = lt; rt < half; rt++) {
            temp += rt;
            if(temp == n) {
                answer++;
            }

            while(temp >= n) {
                temp = temp-lt;
                if(temp == n) {
                    answer++;
                }
                lt++;
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
