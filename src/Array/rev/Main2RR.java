package Array.rev;

import java.util.Scanner;

public class Main2RR {
    public static int solution(int n , int[] arr) {
        int answer = 0;
        int big = 0;

        for(int i = 0; i < n ; i++) {
            if(i == 0) {
                big = arr[i];
                answer+=1;
            } else {
                if(arr[i] > big){
                    big = arr[i];
                    answer+=1;
                }
            }
        }

        return answer;
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print(solution(n,arr));
    }

}
