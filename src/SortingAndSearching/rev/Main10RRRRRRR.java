package SortingAndSearching.rev;

import java.util.Arrays;
import java.util.Scanner;

public class Main10RRRRRRR {
    // 마구간 정하기(결정알고리즘)
    public static int calculate(int[] arr, int mid) {
        int horse = 1;
        int now = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] - arr[now] >= mid) {
                now = i;
                horse++;
            }
        }

        return horse;
    }

    public static int solution(int n, int c, int[] arr){
        int answer = 0;
        Arrays.sort(arr);

        // 최대 거리
        int lt = 1;
        int rt = arr[n-1] - arr[0];

        while(lt <= rt) {
            int mid = (lt + rt) / 2;

            int cal = calculate(arr, mid);

            if(cal >= c) {
                answer = Math.max(answer, mid);
                lt = mid + 1;
            } else {
                rt = mid -1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(n,c,arr));
    }
}
