package Array.rev;

import java.util.Scanner;

public class Main2R {
    public static int solution(int n , int[] arr) {
        int answer = 0;
        int max = 0;

        for(int i=0 ; i < n ; i++) {
            if(i == 0) {
                answer++;
                max = arr[i];
            } else {
                if(arr[i] > max) {
                    answer++;
                    max = arr[i];
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

        System.out.println(solution(n, arr));
    }

}
