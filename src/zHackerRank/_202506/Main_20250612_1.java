package zHackerRank._202506;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_20250612_1 {
    // Sherlock and Array
    public static String solution(int n, int[] arr) {
        String answer = "NO";

        int lt = 0;
        int rt = n - 1;

        while(lt <= rt) {
            int mid = (lt + rt) / 2;

            int leftSum = 0;
            for (int i = 0; i < mid; i++) {
                leftSum += arr[i];
            }

            int rightSum = 0;
            for (int i = mid+1; i < n; i++) {
                rightSum += arr[i];
            }

            if(leftSum == rightSum) {
                answer = "YES";
                break;
            } else if(leftSum > rightSum) {
                rt = mid - 1;
            } else if(leftSum < rightSum) {
                lt = mid + 1;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<String> temp = new ArrayList<>();

        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = in.nextInt();
            }

            temp.add(solution(n,arr));
        }

        for(String x : temp) {
            System.out.println(x);
        }
    }
}
