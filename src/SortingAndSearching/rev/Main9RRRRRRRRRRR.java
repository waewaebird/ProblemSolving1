package SortingAndSearching.rev;

import java.util.Arrays;
import java.util.Scanner;

public class Main9RRRRRRRRRRR {
    // 뮤직비디오(결정알고리즘)
    public static int cal(int[] arr, int mid) {
        int disc = 1;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if(sum > mid) {
                disc++;
                sum = arr[i];
            }
        }

        return disc;
    }

    public static int solution(int n, int m, int[] arr) {
        int answer = Integer.MAX_VALUE;
        int lt = Arrays.stream(arr).min().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while(lt <= rt) {
            int mid = (lt + rt) / 2;

            int result = cal(arr,mid);

            if(result <= m) {
                answer = Math.min(answer, mid);
                rt = mid-1;
            } else {
                lt = mid+1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(n,m,arr));
    }
}
