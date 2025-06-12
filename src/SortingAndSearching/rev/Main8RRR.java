package SortingAndSearching.rev;

import java.util.Arrays;
import java.util.Scanner;

public class Main8RRR {
    // 이분검색
    public static int solution(int n, int m, int[] arr) {
        Arrays.sort(arr);
        int answer = -1;

        int lt = 0;
        int rt = n-1;

        while(lt <= rt) {
            int mid = (lt+rt) / 2;

            if(arr[mid] > m) {
                rt = mid - 1;
            } else if(arr[mid] < m){
                lt = mid + 1;
            } else {
                answer = mid;
                break;
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
