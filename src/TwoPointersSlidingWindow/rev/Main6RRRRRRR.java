package TwoPointersSlidingWindow.rev;

import java.util.Scanner;

public class Main6RRRRRRR {
    // 최대 길이 연속부분수열
    public static Integer solution(int n, int k, int[] arr){
        int answer = 0;

        int lt = 0;

        int cnt = 0;
        for (int rt = 0; rt < n; rt++) {
            if(arr[rt] == 0) {
                cnt++;
            }

            if(cnt > k) {
                while(cnt > k) {
                    if(arr[lt] == 0) {
                        arr[lt] = 1;
                        cnt--;
                    } else {
                        lt++;
                    }
                }

            }

            answer = Math.max(answer, rt - lt);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(n,k,arr));
    }
}
