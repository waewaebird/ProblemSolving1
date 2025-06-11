package zHackerRank;

import java.util.Scanner;

public class Main_20250611_4 {
    // Flatland Space Stations
    public static int solution(int n, int m, int[] station) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        int answer = Integer.MIN_VALUE;

        for(int x : arr) {
            int now = Integer.MAX_VALUE;
            for (int i = 0; i < m; i++) {
                now = Math.min(Math.abs(x-station[i]), now);
            }

            answer = Math.max(answer,now);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] station = new int[m];

        for (int i = 0; i < m; i++) {
            station[i] = in.nextInt();
        }

        System.out.println(solution(n,m,station));
    }
}
