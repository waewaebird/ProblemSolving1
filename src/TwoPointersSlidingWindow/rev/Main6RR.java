package TwoPointersSlidingWindow.rev;

import java.util.Scanner;

public class Main6RR {
    public static int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = 0;

        for (int rt = 0; rt < n; rt++) {
            if(arr[rt] == 0) {
                if(m > 0) {
                    m--;
                } else {
                    for (int i = lt; i < n; i++) {
                        if(arr[i] == 0) {
                            lt = i+1;
                            break;
                        }
                    }
                }
            }

            answer = Math.max(answer,rt-lt+1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        int m = in.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(n,m,arr));
    }
}
