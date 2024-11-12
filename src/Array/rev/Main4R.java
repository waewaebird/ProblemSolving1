package Array.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4R {
    public static int[] solution(int n){
        int[] answer = new int[n];
        for(int i = 0 ; i < n ; i++) {
            if(i == 0 || i == 1) {
                answer[i] = 1;
            } else {
                answer[i] = answer[i-1] + answer[i-2];
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();

        for(int i :  solution(input1)) {
            System.out.print(i + " ");
        }

    }
}
