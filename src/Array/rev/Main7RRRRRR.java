package Array.rev;

import java.util.Scanner;

public class Main7RRRRRR {
    // 점수계산
    public static Integer solution(int n , int[] arr) {
        int answer = 0;

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] == 1) {
                cnt++;
                answer += 1*cnt;
            } else {
                cnt = 0;
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
