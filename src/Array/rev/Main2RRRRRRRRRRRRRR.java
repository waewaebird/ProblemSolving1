package Array.rev;

import java.util.Scanner;

public class Main2RRRRRRRRRRRRRR {
    // 보이는 학생
    public static int solution(int n, int[] arr) {
        int answer= 1;

        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if(arr[i] > max) {
                answer++;
                max = arr[i];
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
