package SortingAndSearching.rev;

import java.util.Arrays;
import java.util.Scanner;

public class Main9RR {
    public static int calculate(int mid, int[] arr) {
        // 23
        int cnt = 1;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if(sum > mid) {
                cnt++;
                sum = 0;
                i = i-1;
            }
        }
        return cnt;
    }



    public static int solution(int n, int m, int[] arr) {
        int answer = Integer.MAX_VALUE;

        //DVD의 가능한 용량은 1 부터 arr모든 합까지.
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).sum();

        int lt = min;
        int rt = max;

        while(lt <= rt) {
            int mid = (lt+rt) / 2;
            if(calculate(mid , arr) <= m) { //중간값으로 DVD용량을 하면 어떤지 확인.
                // 담을수 있는 cd 갯수를 확인
                // DVD m장 안에 담을 수 있음
                answer = Math.min(answer,mid);
                rt = mid-1; // 더 큰용량은 볼필요가없음.
            } else {
                // DVD m장 안에 담을 수 없음
                lt = mid+1; // 더 작은용량은 볼필요가 없음
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
