package SortingAndSearching.rev;

import java.util.Arrays;
import java.util.Scanner;

public class Main10RRRRRRRRRR {
    // 마구간 정하기
    public static int cal(int mid, int[] arr) {
        int horse = 1;

        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] - arr[start] >= mid) {
                horse++;
                start = i;
            }
        }

        return horse;
    }

    public static int solution(int n, int m, int[] arr){
        int answer = 0;

        Arrays.sort(arr);

        int lt = 1;
        int rt = arr[arr.length -1];

        while(lt <= rt) {
            int mid = (lt+rt) / 2;

            int result = cal(mid, arr);

            if(result >= m) {
                answer = Math.max(answer, mid);
                lt = mid + 1;
            } else {
                rt = mid - 1;
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
