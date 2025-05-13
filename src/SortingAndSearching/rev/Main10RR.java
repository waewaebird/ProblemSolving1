package SortingAndSearching.rev;

import java.util.Arrays;
import java.util.Scanner;

public class Main10RR {
    public static int cal(int[] arr, int mid) {
        //말 배치
        int cnt = 1;
        int startPonint = 0;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] - mid >= arr[startPonint]) {
                cnt++;
                startPonint = i;
            }
        }
        return cnt;
    }

    public static int solution(int n, int c, int[] arr) {
        // 1 2 4 8 9
        // 최소 : 1 , 최대 24
        // 두말의 최대 거리는 8
        int answer = Integer.MIN_VALUE;

        int lt = 1;
        int rt = arr[n-1];

        while(lt <= rt) {
            int mid = (lt+rt) / 2;

            int hCnt = cal(arr, mid);

            if(hCnt < c) {
                // 마구간이 부족하기 때문에 거리를 더 줄여야한다.
                // 중간값을 줄여본다
                rt = mid -1;
            } else {
                // 중간값을 키워본다
                answer = Math.max(answer,mid);
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

        Arrays.sort(arr);
        System.out.println(solution(n,c,arr));
    }
}
