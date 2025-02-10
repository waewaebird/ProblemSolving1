package SortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;

public class Main9 {
    //결정 알고리즘. (연속적일때만 사용가능)
    // lt rt 사이에 확실한 답이 있을떄 적용할 수 있음.

    // 1. 문제에서 최소의 가장작은 숫자는 노래중에 가장 큰값 lt 9
    // 2. 가장 큰값은 다 더한 rt 45
    // 3. mid를 찾는다 27
    // 4. 연속해서 3장에 담을 수 있는지 찾는다.
    public static int count(int[] arr, int capacity) {
        int cnt = 1; //DVD장수 이미 한장
        int sum = 0; //곡들의 합 , 차지하고 있는 용량
        for(int x : arr) {
            //첫번째 DVD에 담는다
            if(sum + x > capacity) {
                cnt++;
                sum = x;
            } else {
                sum+= x;
            }
        }
        return cnt;
    }

    public static int solution2(int n, int m, int[] arr) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();
        while (lt <= rt) {
            int mid = (lt+rt)/2;
            if(count(arr,mid)<= m) {
                answer = mid;
                rt =mid-1;
            } else {
                lt = mid+1;
            }
        }
        return answer;
    }



    public static int solution(int n, int m, int[] arr) {
        int sum = 0;
        for(int x : arr) {
            sum += x;
        }
        int mid = sum/m+1;
        int answers = 0;

        while(true) {
            int temp = 0;

            for (int rt = 0; rt < n; rt++) {
                temp += arr[rt];

                if(temp == mid) {
                    answers++;
                    temp = 0;
                } else if(temp > mid){
                    while(mid < temp) {
                        temp -= arr[rt];
                        rt--;
                        answers++;
                        temp = 0;
                    }
                } else {
                    if(rt == n-1){
                        answers++;
                    }
                }
            }

            if(answers <= m) {
                break;
            } else {
                mid++;
                answers = 0;
            }
        }

        return mid;
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


/*
9 3
1 2 3 4 5 6 7 8 9

5 4
1 1 1 1 1

* */