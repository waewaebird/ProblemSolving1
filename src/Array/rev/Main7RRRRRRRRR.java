package Array.rev;

import java.util.Scanner;

public class Main7RRRRRRRRR {
    // 점수계산
    public static int solution(int n, int[] arr) {
        int answer = 0;

        int cnt = 1;
        for(int x : arr) {
            if(x == 1) {
                answer += x * cnt;
                cnt++;
            } else if(x == 0){
                cnt = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(n,arr));
    }
}
