package SortingAndSearching.rev;

import java.util.Arrays;
import java.util.Scanner;

public class Main10RRR {
    //마구간 정하기
    public static int howMany(int mid, int[] arr) {
        int horse = 1;

        int now = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] - arr[now] >= mid) {
                horse++;
                now = i;
            }
        }

        return horse;
    }

    public static int solution(int n, int c, int[] arr) {
        Arrays.sort(arr);

        int lt = arr[0];
        int rt = arr[arr.length-1] + 1;

        int answer = Integer.MIN_VALUE;

        while(lt <= rt) {
            int mid = (lt + rt) / 2;

            int con = howMany(mid,arr);

            if(con < c) {
                // 다 집어 넣지 못하니깐 범위를 적기해야함
                rt = mid - 1;
            } else {
                lt = mid + 1;
                answer = Math.max(answer, mid);
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
