package zHackerRank;

import java.util.Scanner;

public class Main_20250515_4 {
    // Divisible Sum Pairs
    public static int solution(int n, int k, int[] arr) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(i != j) {
                    if((arr[i] + arr[j]) % k == 0) {
                        answer++;
                    }
                }
            }
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
