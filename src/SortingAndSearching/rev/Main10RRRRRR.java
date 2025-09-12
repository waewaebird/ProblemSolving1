package SortingAndSearching.rev;

import java.util.Arrays;
import java.util.Scanner;

public class Main10RRRRRR {
    // 마구간 정하기
    private static Integer calculate(int[] arr, int mid) {
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
        int answer = 0;

        Arrays.sort(arr);

        int lt = 1;
        int rt = arr[arr.length-1] - arr[0];

        while(lt <= rt) {
            int mid = (lt+rt) / 2;

            int result = calculate(arr, mid); //거리가 mid일때 몇마리 배치할 수 있냐?

            if(result < c) {
                rt = mid - 1;
            } else {
                answer = Math.max(answer, mid);
                lt = mid + 1;
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
