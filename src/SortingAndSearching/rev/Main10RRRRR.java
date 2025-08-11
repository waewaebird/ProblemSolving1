package SortingAndSearching.rev;

import java.util.Arrays;
import java.util.Scanner;

public class Main10RRRRR {
    // 마구간 정하기
    public static Integer count(int mid, int[] arr) {
        int horse = 1;

        int nowPoint = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] - arr[nowPoint] >= mid) {
                horse++;
                nowPoint = i;
            }
        }

        return horse;
    }

    public static Integer solution(int n, int c, int[] arr) {
        Arrays.sort(arr);

        int lt = arr[0];
        int rt = arr[n-1];

        int answer = 0;
        while(lt <= rt) {
            int mid = (lt+rt) / 2;

            int cnt = count(mid, arr);

            if(cnt >= c) {
                lt = mid + 1;
                answer = Math.max(answer,mid);
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

        System.out.println(solution(n, c, arr));
    }
}
