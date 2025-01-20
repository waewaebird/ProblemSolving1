package TwoPointersSlidingWindow.rev;

import java.util.Scanner;

public class Main6R {
    public static int solution2(int n, int k, int[] arr) {
        int answer = 0;

        int cnt = 0;

        int lt = 0;
        for (int rt = 0; rt < n; rt++) {
            if(arr[rt] == 0) {
                cnt++;
            }

            while(cnt > k) {
                if(arr[lt] == 0) {
                    cnt--;
                }
                lt++;
            }

            answer = Math.max(answer, rt - lt +1);
        }

        return answer;
    }






    public static int solution(int n, int k, int[] arr) {
        int answer = 0;
        int lt = 0;
    // 14 2
    // 1 1 0 0 1 1 0 1 1 0 1 1 0 1

        int cnt = 0;
        for (int rt = 0; rt < n; rt++) {
            if(arr[rt] == 0) {
                cnt++; // 0을 만나면 바꾼 횟수추가
            }

            // cnt가 제한 횟수보다 커지면
            while(cnt > k) {
                if(arr[lt] == 0) { // 0인곳을 찾는 과정 찾을때까지의 lt++ , 찾으면 cnt 줄여줌 언제까지? k밑으로
                    cnt--;
                }
                lt++;
            }

            answer = Math.max(answer, rt-lt+1); // rt는 지금까지 진행된곳 , lt는 마지막으로 바꾼곳
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
