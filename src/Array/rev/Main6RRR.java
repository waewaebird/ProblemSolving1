package Array.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main6RRR {
    public static List<Integer> solution(int n, int[] arr) {
        List<Integer> answers = new ArrayList<>();
        for(int a : arr){
            StringBuilder sb = new StringBuilder(String.valueOf(a)).reverse();
            Integer ai = Integer.valueOf(sb.toString());

            boolean flag = true;
            for(int i = 2 ; i < ai ; i++) {
                if(ai%i == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag == true && ai > 1) {
                answers.add(ai);
            }
        }
        return answers;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = in.nextInt();
        }


        for(int nn : solution(n, arr)) {
            System.out.print(nn + " ");
        }

    }

}
