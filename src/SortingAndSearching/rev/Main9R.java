package SortingAndSearching.rev;

import java.util.Scanner;

public class Main9R {
    public static int count(int[] arr , int mid) {
        int disc = 1;

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if(temp + arr[i] > mid) {
                disc++;
                temp = arr[i];
            } else {
                temp = temp+arr[i];
            }
        }

        return disc;
    }

    public static int solution(int n, int m, int[] arr) {
        int sum = 0;
        for(int x : arr){
            sum += x;
        }

        int lt = arr[0];
        int rt = sum;

        int answer = sum;

        //단수 배열이 정렬된다는게 아니라, lt ~ rt 최솟갑 최대값이 정렬돼있어야 함!
        while(lt <= rt) {
            int mid = (lt+rt) / 2;

            if(count(arr,mid) <= m) {
                answer = Math.min(answer,mid);
                rt = mid-1;
            } else {
                lt = mid+1;
            }
        }

        return answer;
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
