package Array.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main6RR {
    private static Integer[] solution(int n , int[] arr) {
        List<Integer> answers = new ArrayList<>();
        for(int a : arr) {
            StringBuilder sb = new StringBuilder(String.valueOf(a));
            Integer temp = Integer.parseInt(sb.reverse().toString());

            int flag = 0;
            for(int i = 2 ; i < temp ; i++) {
                if(temp % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if(temp > 1 && flag == 0) {
                answers.add(temp);
            }
        }

        return answers.toArray(new Integer[answers.size()]);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = in.nextInt();
        }
        for(int nn : solution(n,arr)) {
            System.out.print(nn + " ");
        }
    }
}