package zHackerRank;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main_20250903_1 {
    // Chief Hopper
    public static Integer solution(int n, int[] arr, int max, int min) {

        Integer answer = Integer.MAX_VALUE;
        int start = arr[0]/ 2;
        if(n > 1) {
            if(arr[0] < arr[1]) {
                start = arr[1] / 2;
            }
        }

        for (int i = start; i <= max; i++) {
            BigDecimal cal = new BigDecimal(i);
            for (int j = 0; j < n; j++) {
                cal = cal.add(cal.subtract(new BigDecimal(arr[j])));

                int compareResult = cal.compareTo(BigDecimal.ZERO);
                if(compareResult < 0) {
                    break;
                }
            }
            if(cal.compareTo(BigDecimal.ZERO) >= 0) {
                answer = Math.min(answer,i);
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            max = Math.max(arr[i], max);
            min = Math.min(arr[i], min);
        }

        System.out.println(solution(n,arr,max,min));
    }
}
