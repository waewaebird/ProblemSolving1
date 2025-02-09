package SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class Main8 {
    //2분검색 , 2진검색 무조건 정렬 돼있어야함
    //순착검색 O(n) , 이분검색 O(n/2)
    
    public static int solution2(int n, int m, int[] arr) {
        int answer = 0;

        Arrays.sort(arr);

        int lt = 0;
        int rt = n-1;

        while(lt <= rt) {
            int mid = (lt+rt)/2;
            if(arr[mid] == m) {
                answer = mid+ 1;
                break;
            }
            if(arr[mid] > m) {
                rt = mid-1;
            } else {
                lt = mid+1;
            }
        }
        return answer;
    }

    public static int solution(int n, int m, int[] arr) {
        Arrays.sort(arr);
        return Arrays.binarySearch(arr, m)+1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];
        int m = in.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(n,m,arr));
    }
}
