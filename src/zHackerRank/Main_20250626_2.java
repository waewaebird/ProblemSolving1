package zHackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_20250626_2 {
    // Fair Rations
    public static String solution(int n, int[] arr) {
        List<Integer> odds = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if(arr[i] % 2 != 0) {
                odds.add(arr[i]);
            }
        }


        if(odds.size() % 2 != 0) {
            return "NO";
        } else {
            int sum = 0;

            for (int i = 0; i < n-1; i++) {
                if(arr[i] % 2 == 0) {
                    continue;
                } else {
                    arr[i] = arr[i] + 1;
                    arr[i+1] = arr[i+1] + 1;

                    sum += 2;

                }
            }

            return String.valueOf(sum);
        }
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
