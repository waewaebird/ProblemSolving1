package zHackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Main_20250701_3 {
    // Mark and Toys
    public static int solution(int n, int k, int[] arr){
        int answer = 0;
        int sum = 0;

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            answer++;

            if(sum > k) {
                answer--;
                break;
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
