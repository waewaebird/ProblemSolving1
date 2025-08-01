package zHackerRank._202507;

import java.util.Scanner;

public class Main_20250724_1 {
    // Lisa's Workbook
    public static Integer solution(int n, int k, int[] arr) {
        int answer = 0;
        int page = 0;

        for (int i = 0; i < n; i++) {
            page++;
            int len = arr[i];
            for (int j = 1; j <= len; j++) {
                if(page == j) {
                    answer++;
                }

                if(j%k == 0 && j != len) {
                    page++;
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
