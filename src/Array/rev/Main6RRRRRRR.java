package Array.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main6RRRRRRR {
    // 뒤집은 소수
    public static List<Integer> solution(int n, int[] arr) {
        List<Integer> answers = new ArrayList<>();

        for(int number : arr) {
            StringBuilder sb = new StringBuilder(String.valueOf(number)).reverse();

            Integer nows = Integer.valueOf(sb.toString());

            if(nows == 2 || nows == 3){
                answers.add(nows);
            } else {
                boolean is = false;
                for (int i = 2; i < nows/2 + 1 ; i++) {
                    if(nows % i == 0) {
                        is = true;
                        break;
                    }
                }
                if(nows != 1 && !is) {
                    answers.add(nows);
                }
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

        for(Integer x : solution(n,arr)) {
            System.out.print(x + " ");
        }
    }
}
