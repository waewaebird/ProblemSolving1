package SortingAndSearching.rev;

import java.util.Scanner;

public class Main9RRRRR {
    // 뮤직비디오(결정알고리즘)
    public static int cal(int mid, int[] arr) {
        int cd = 1;

        int sums = 0;
        for (int i = 0; i < arr.length; i++) {
            sums += arr[i];

            if(sums > mid) {
                cd++;
                sums = arr[i];
            }
        }

        return cd;
    }

    public static int solution(int n, int m, int[] arr, int sum) {
        int answer = Integer.MAX_VALUE;
        int lt = 1;
        int rt = sum;

        while (lt <= rt) {
            int mid = (lt+rt) / 2;

            int cal = cal(mid, arr);

            if(cal <= m) {
                rt = mid - 1;
                answer = Math.min(answer, mid);
            } else {
                lt = mid + 1;
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] arr = new int[n];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            sum += arr[i];
        }

        System.out.println(solution(n,m,arr,sum));
    }
}
