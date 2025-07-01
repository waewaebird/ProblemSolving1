package zHackerRank._202506;

import java.util.Scanner;

public class Main_20250618_3 {
    // Running Time of Algorithms
    public static int solution(int n, int[] arr) {
        int answer = 0;
        for (int i = 1; i < n; i++) {
            int index = i;

            for (int j = i -1; j >= 0 ; j--) {
                if(arr[index] < arr[j]) {
                    int temp = arr[index];
                    arr[index] = arr[j];
                    arr[j] = temp;
                    index = j;

                    answer++;
                }
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
