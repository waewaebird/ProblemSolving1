package SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class Main10 {
    public static int count(int[] arr , int dist) {
        int horse = 1; //무조건 한마리
        int endPosition = arr[0]; // 부터 시작

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]-endPosition >= dist) {
                endPosition = arr[i];
                horse++;
            }
        }
        return horse;
    }


    public static int solution(int n, int c, int[] arr) {
        Arrays.sort(arr);

        int answer = 0;
        int lt = 1;
        int rt = arr[n-1];

        while(lt <= rt) {
            int mid = (lt+rt) / 2;
            if(count(arr, mid) >= c) {
                answer = Math.max(answer,mid);
                lt = mid+1;
            } else {
                rt = mid-1;
            }
        }

        return answer;
    }




    public static int count2(int[] arr, int dist) {
        int cnt = 1; //배치한 말의 마릿수
        int endPosition = arr[0];// 무조건 제일 왼쪽좌표에 배치하는게 유리하다
        for(int i = 1 ; i<arr.length ; i++) {
            if(arr[i] - endPosition >= dist) {
                cnt++;
                endPosition = arr[i];
            }
        }
        return cnt;
    }


    public static int solution2(int n, int c, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n-1];
        //이분 검색
        while(lt<=rt) {
            int mid = (lt+rt) / 2;
            if(count2(arr, mid) >= c) {
                answer = mid;
                lt = mid+1;
            } else {
                rt = mid-1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr =new int[n];

        int c = in.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(n,c,arr));
    }
}


/*
5 3
1 2 8 4 9
* */