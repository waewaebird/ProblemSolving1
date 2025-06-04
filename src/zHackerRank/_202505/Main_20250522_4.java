package zHackerRank._202505;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_20250522_4 {
    // Cut the sticks
    public static List<Integer> solution(int n, int[] arr) {
        List<Integer> answers = new ArrayList<>();

        while(true) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if(arr[i] > 0) {
                    min = Math.min(min, arr[i]);
                }
            }

            if(min == Integer.MAX_VALUE) {
                break;
            }

            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if(arr[i] - min >= 0) {
                    arr[i] = arr[i] - min;
                    cnt++;
                }
            }
            answers.add(cnt);
        }



        return answers;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for(int x : solution(n,arr)) {
            System.out.println(x);
        }
    }

}
