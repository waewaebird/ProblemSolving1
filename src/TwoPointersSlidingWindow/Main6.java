package TwoPointersSlidingWindow;

import java.util.Scanner;

public class Main6 {
    public static int solution2(int n, int k, int[] arr) {
        int answer = 0;
        int cnt = 0;
        int lt = 0;

        for(int rt = 0; rt<n; rt++) {
            if(arr[rt] == 0) {
                cnt++;
            }
            while(cnt>k) {
                if(arr[lt]==0) {
                    cnt--;
                    lt++;
                }
            }
            answer = Math.max(answer,rt-lt+1);

        }


    }

    public static int solution(int n, int k, int[] arr) {
        int cnt = 0;
        int min = 0;
        int answer = 0;

        /*
        20 2
        1 0 1 1 1 1 1 0 1 0 1 1 1 1 1 0 1 1 0 1
        */

        for (int i = 0; i < n; i++) {
            if(arr[i] == 1) {
                cnt++;
            } else {
                if(k > 0) {
                    if(i > min) {
                        min = i; // 1
                    }
                    k = k-1; //1 0
                    cnt++; //2
                } else if(k == 0) {
                    k++;
                    cnt = cnt - min + 1;

                }
            }
            answer = Math.max(answer, cnt);
        }

        return answer-1;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        int k = in.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(n,k,arr));

    }
}
