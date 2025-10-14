package SortingAndSearching.rev;

import java.util.Arrays;
import java.util.Scanner;

public class Main8RRRRRRR {
    // 이분검색
    public static Integer solution(int n, int m, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);

        int lt = 0;
        int rt = n-1;

        while(lt <= rt) {
            int mid = (lt+rt) / 2;
            if(arr[mid] == m) {
                answer = mid+1;
                break;
            } else if(arr[mid] < m) {
                lt++;
            } else {
                rt--;
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
