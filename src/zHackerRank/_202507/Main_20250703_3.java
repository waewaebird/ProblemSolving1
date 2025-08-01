package zHackerRank._202507;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main_20250703_3 {
    // Stock Maximize
    public static BigDecimal solution(int n, int[] arr, int maxValue) {
        BigDecimal answer = new BigDecimal(0);

        int stock = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] < maxValue) {
                //dp[i] = dp[i] - arr[i];
                answer = answer.subtract(new BigDecimal(arr[i]));
                stock++;
            } else if(arr[i] == maxValue) {
                if(stock > 0) {
                    //dp[i] = dp[i] + arr[i] * stock;
                    BigDecimal temp1 = new BigDecimal(arr[i]);
                    BigDecimal temp2 = new BigDecimal(stock);
                    BigDecimal multi = temp1.multiply(temp2);
                    answer = answer.add(multi);
                }
                stock = 0;
                maxValue = Integer.MIN_VALUE;
                for (int j = i+1; j < n; j++) {
                    maxValue = Math.max(maxValue, arr[j]);
                }
            }
        }

        if(answer.compareTo(new BigDecimal(0)) < 0) {;
            answer = new BigDecimal(0);
        }

        return answer;
    }


    public static void main(String[] args) throws IOException {
        List<BigDecimal> answers = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(br.readLine());

        for (int i = 0; i < q; i++) {
            int maxValue = Integer.MIN_VALUE;

            int n = Integer.parseInt(br.readLine());

            int[] arr = new int[n];

            String[] reads = br.readLine().split(" ");

            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(reads[j]);
                maxValue = Math.max(arr[j], maxValue);
            }
            answers.add(solution(n,arr,maxValue));
        }

        for(BigDecimal x : answers) {
            System.out.println(x);
        }
    }
}