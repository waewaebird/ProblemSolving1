package zHackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Main_20250702_3 {
    // Hackerland Radio Transmitters
    public static Integer canPlace(int[] arr, int k) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if(i > 0) {
                if(arr[i] - arr[0] > k) {
                    break;
                }
            }

            int nowPoint = i;
            int cnt = 1;
            for (int j = i+1; j < arr.length; j++) {
                if(nowPoint > j) {
                    continue;
                }
                if(arr[j] - arr[nowPoint] > k) {
                    int temp = 0;
                    for (int l = j + 1; l < arr.length; l++) {
                        if(arr[l] - arr[j] <= k) {
                            temp = l;
                        } else {
                            break;
                        }
                    }

                    nowPoint = temp;
                    cnt++;
                }
            }

            min = Math.min(min, cnt);
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr= new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);

        System.out.println(canPlace(arr, k));
    }
}
