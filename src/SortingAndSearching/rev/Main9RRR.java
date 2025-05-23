package SortingAndSearching.rev;

import java.util.Scanner;

public class Main9RRR {
    public static int count(int mid, int[] arr) {
        int len = 0;

        int cnt = 1;
        for (int i = 0; i < arr.length; i++) {
            if(len + arr[i] <= mid) {
                len += arr[i];
            } else {
                cnt++;
                len = arr[i];
            }
        }
        return cnt;
    }

    public static int solution(int n, int m, int[] arr) {
        int answer = Integer.MAX_VALUE;

        int max = 0;
        int sum = 0;
        for(int x: arr) {
            max = Math.max(max, x);
            sum += x;
        }

        int lt = max;
        int rt = sum;

        while(lt <= rt) {
            int mid = (lt+rt) / 2;
            int dvds = count(mid, arr);

            if(dvds <= m) {
                rt = mid - 1;
                answer = Math.min(answer,mid);
            } else {
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
