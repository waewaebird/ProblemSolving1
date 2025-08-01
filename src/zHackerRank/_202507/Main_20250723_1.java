package zHackerRank._202507;

import java.util.Arrays;
import java.util.Scanner;

public class Main_20250723_1 {
    // Equal
    private static Integer solution(int n, int[] arr, int min) {
        int answer = Integer.MAX_VALUE;
        int[] m = {5,2,1};

        int cnt = 0;
        int mark = min-4;

        while(min >= mark) {
            int[] temps = Arrays.copyOf(arr, arr.length);
            for (int i = 0; i < n; i++) {
                if(temps[i] != min) {
                    for (int j = 0; j < 3; j++) {
                        while(temps[i] - m[j] >= min) {
                            temps[i] = temps[i] - m[j];
                            cnt++;
                        }
                    }
                }
            }
            min--;
            answer = Math.min(cnt, answer);
            cnt = 0;
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int[] arr = new int[n];

            int min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();

                min = Math.min(min, arr[j]);
            }

            System.out.println(solution(n,arr,min));
        }

    }
}
