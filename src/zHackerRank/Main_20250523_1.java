package zHackerRank;

import java.util.Scanner;

public class Main_20250523_1 {
    // Viral Advertising
    public static int solution(int n) {
        int answer = 0;

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            if(i == 0) {
                arr[i] = (5 / 2);
            } else {
                arr[i] = (arr[i-1] * 3) / 2;
            }

            answer += arr[i];
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        System.out.println(solution(n));

    }
}
