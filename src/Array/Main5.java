package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main5 {
    public static int solution(int n) {
        int answer = 0;
        int[] arr = new int[n+1];
        List<Integer> temp = new ArrayList<>();

        for(int i = 2 ; i <= n ; i++) {
            if(arr[i] == 0) {
                answer++;
                for(int j = i ; j <= n ; j = i+j) {
                    arr[j] = 1;
                }
            }
        }

        return answer;
    }



    public static int solution2(int n){
        int answer = 0;
        int[] ch = new int[n+1];
        for(int i=2; i<=n ; i++) {
            // 2 3 4 5 6 7 8 9 10
            if(ch[i] == 0) {
                answer++;
                for(int j = i ; j<=n; j=j+i) {

                    //2 ; 10 ; 2 4 6 8 10;
                    //3 ; 10 ; 3 6 9


                    ch[j] = 1;
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();
        System.out.println(solution(input1));
    }
}