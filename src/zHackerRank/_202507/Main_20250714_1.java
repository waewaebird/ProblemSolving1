package zHackerRank._202507;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Main_20250714_1 {
    // Minimum Loss
    public static BigDecimal solution(int n, BigDecimal[] arr) {
        BigDecimal answer = BigDecimal.ZERO;

        BigDecimal[] copy = Arrays.copyOf(arr, arr.length);

        Arrays.sort(copy);

        BigDecimal first = BigDecimal.ZERO;
        BigDecimal second = BigDecimal.ZERO;
        for (int i = 0; i < n-1; i++) {
            BigDecimal nowV = copy[i+1].subtract(copy[i]);

            if(!answer.equals(BigDecimal.ZERO) && answer.compareTo(nowV) < 0) {
                continue;
            }

            int index1 = 0;
            for (int j = 0; j < n; j++) {
                if(copy[i] == arr[j]) {
                    index1 = j;
                    break;
                }
            }

            int index2 = 0;
            for (int j = 0; j < n; j++) {
                if(copy[i+1] == arr[j]) {
                    index2 = j;
                    break;
                }
            }

            if(index2 < index1) {
                first = copy[i+1];
                second = copy[i];

                answer = first.subtract(second);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        BigDecimal[] arr = new BigDecimal[n];

        for (int i = 0; i < n; i++) {
            String str = in.next();

            arr[i] = new BigDecimal(str);
        }

        System.out.println(solution(n,arr));
    }
}
