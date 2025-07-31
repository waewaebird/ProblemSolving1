package SortingAndSearching.rev;

import java.util.Arrays;
import java.util.Scanner;

public class Main10RRRR {
    // 마구간 정하기
    public static Integer calculate(int n, int mid, int[] arr) {
        int cnt = 1;
        int point = 0;
        for (int rt = 0; rt < n; rt++) {
            if(arr[rt] - arr[point] >= mid) {
                cnt++;
                point = rt;
            }
        }
        return cnt;
    }

    public static Integer solution(int n, int c, int[] arr) {
        int answer = Integer.MIN_VALUE;
        Arrays.sort(arr);

        //거리
        int lt = arr[1] - arr[0];
        int rt = arr[n-1];

        while(lt <= rt) {
            int mid = (lt + rt) / 2;
            int cnt = calculate(n,mid,arr);

            if(cnt >= c) {
                lt = mid + 1;
                answer = Math.max(answer, mid);
            } else {
                rt = mid - 1;
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
