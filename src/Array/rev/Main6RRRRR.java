package Array.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main6RRRRR {
    public static List<Integer> solution(int n, int[] arr) {
        List<Integer> answers = new ArrayList<>();
        for(int x : arr) {
            StringBuilder sb = new StringBuilder(String.valueOf(x));
            Integer temp = Integer.valueOf(sb.reverse().toString());


            if(temp > 1) {
                boolean flag = true;
                for (int i = 2; i < temp; i++) {
                    if(temp%i == 0) {
                        flag = false;
                        break;
                    }
                }

                if(flag == true) {
                    answers.add(temp);
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
