package SortingAndSearching.rev;

import java.util.Arrays;
import java.util.Scanner;

public class Main9RRRRRRRR {
    // 뮤직비디오(결정알고리즘)
    public static int cal(int[] arr, int mid) {
        int cnt = 1;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if(sum > mid) {
                sum = arr[i];
                cnt++;
            }
        }

        return cnt;
    }

    public static int solution(int n, int m, int[] arr) {
        int answer = Integer.MAX_VALUE;

        int lt = arr[0];
        int rt = Arrays.stream(arr).sum();

        while(lt <= rt) {
            int mid = (lt + rt) / 2;

            int cnt = cal(arr,mid);

            //3으로 해도 되냐 그럼 cd2장이면 되던데
            // 그럼 좀 줄여앶

            if(cnt <= m) {
                answer = Math.min(answer, mid);
                rt = mid - 1;
            } else if(cnt > m) {
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
