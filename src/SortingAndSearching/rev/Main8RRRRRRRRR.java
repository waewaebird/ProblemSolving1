package SortingAndSearching.rev;

import java.util.Arrays;
import java.util.Scanner;

public class Main8RRRRRRRRR {
    // 이분검색
    public static int solution(int n, int m, int[] arr) {
        Arrays.sort(arr);

        int min = 0;
        int max = n-1;

        int answer = 0;

        while(min <= max) {
            int mid = (min+max) / 2;

            if(arr[mid] == m) {
                answer = mid;
                break;
            } else if(arr[mid] < m) {
                min = mid + 1;
            } else if(arr[mid] > m) {
                max = mid - 1;
            }
        }

        return answer+1;
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
