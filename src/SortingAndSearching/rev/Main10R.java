package SortingAndSearching.rev;

import java.util.Arrays;
import java.util.Scanner;

public class Main10R {
    public static int cal(int[] arr, int mid) {
        int horse = 1;

        int startPoint = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= startPoint + mid) {
                startPoint = arr[i];
                horse++;
            }
        }
        return horse;
    }


    public static int solution(int n, int c, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n-1];

        while (lt <= rt) {
            int mid = (lt + rt)/ 2; //최대 거리라 가정

            if(cal(arr, mid) >= c) {
                //3마리 이상이면 더큰 거리를 찾기 위해
                answer = Math.max(answer,mid);
                lt = mid + 1;
            } else{
                //3마리가 안되니깐 더 작은 거리를 찾는다.
                rt = mid - 1;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(n,c,arr));
    }
}


/*
1. 마굿간에 말을 배치한다.

2. lt와 rt를 먼저 정한다.

3. 문제에서 lt와 rt는 말사이의 거리이다 (1부터 끝 9)

4. 가장가까운 말의 거리를 mid로 넣고 말을 배치한다.

*/