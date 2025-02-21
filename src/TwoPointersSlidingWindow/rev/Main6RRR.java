package TwoPointersSlidingWindow.rev;

import java.util.Scanner;

public class Main6RRR {
    public static int solution(int n, int m, int[] arr){
        int answer = 0;

        int lt = 0;
        for (int rt = 0; rt < n; rt++) {
            if(arr[rt] == 0) {
                if(m > 0) {
                    m--;
                } else {
                    while(true) {
                        if(arr[lt] == 0) {
                            arr[lt] = 1;
                            break;
                        } else {
                            lt++;
                        }
                    }
                }
            }

            answer = Math.max(answer, rt-lt);
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

        System.out.println(solution(n,m,arr));
    }

}
