package SortingAndSearching.rev;

import java.util.Scanner;

public class Main9RRRRRR {
    // 뮤직비디오(결정알고리즘)
    public static Integer cal(int mid, int[] arr) {
        int cnt = 1;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if(sum > mid) {
                cnt++;
                sum = arr[i];
            }
        }

        return cnt;
    }

    public static Integer solution(int n, int m, int[] arr) {
        int answer = Integer.MAX_VALUE;

        int lt = Integer.MAX_VALUE;
        int rt = 0;
        for (int i = 0; i < n; i++) {
            lt = Math.min(arr[i], lt);
            rt += arr[i];
        }

        while(lt <= rt) {
            int mid = (lt + rt) / 2;

            int cnt = cal(mid, arr);

            if(cnt <= m) {
                answer = mid;
                rt = mid - 1;
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
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(n,m,arr));
    }
}
