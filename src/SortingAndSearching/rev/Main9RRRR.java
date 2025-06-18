package SortingAndSearching.rev;

import java.util.Scanner;

public class Main9RRRR {
    // 뮤직비디오(결정알고리즘)
    public static int calculate(int mid, int[] arr) {
        int cd = 1;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if(sum > mid) {
                cd++;
                sum = arr[i];
            }
        }

        return cd;
    }

    public static int solution(int n, int m, int[] arr, int max) {
        int lt = 1;
        int rt = max;

        int answer = Integer.MAX_VALUE;
        while(lt <= rt) {
            int mid = (lt+rt) / 2;

            int cal = calculate(mid, arr);

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
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            max += arr[i];
        }

        System.out.println(solution(n,m,arr,max));
    }

}
