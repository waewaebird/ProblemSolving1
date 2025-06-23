package Array.rev;

import java.util.Scanner;

public class Main7RRRR {
    // 점수계산
    public static Integer solution(int n, int[] arr) {
        int sum = 0;
        int k = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] == 1) {
                k++;
                sum += k * arr[i];
            } else {
                k = 0;
            }
        }
        return sum;
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
