package SortingAndSearching.rev;

import java.util.Scanner;

public class Main9RRRRRRR {
    public static int calculate(int mid, int[] arr) {
        int cd = 1;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if(sum >= mid) {
                cd++;
                if(sum == mid) {
                    sum = 0;
                } else {
                    sum = arr[i];
                }
            }
        }

        if(sum == 0) {
            cd--;
        }

        return cd;
    }

    public static int solution(int n, int m, int[] arr, int sum, int min, int max) {
        int answer = Integer.MAX_VALUE;

        int lt = min;
        int rt = sum;

        while(lt <= rt) {
            int mid = (lt+rt) / 2;

            int result = calculate(mid, arr);

            if(result <= m)  {
                answer = Math.min(answer, mid);
                rt = mid - 1;
            } else if(result > m) {
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

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();

            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);

            sum += arr[i];
        }

        System.out.println(solution(n,m,arr,sum,min,max));
    }
}
