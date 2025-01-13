package Array.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main6RRRR {
    public static List<Integer> solution(int n, int[] arr){
        List<Integer> answers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder(String.valueOf(arr[i])).reverse();
            Integer number = Integer.parseInt(sb.toString());

            boolean flag = true;
            for (int j = 2; j < number; j++) {
                if(number % j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag == true && number > 1) {
                answers.add(number);
            }
        }
        return answers;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for(Integer a : solution(n,arr)){
            System.out.print(a + " ");
        }

    }
}
