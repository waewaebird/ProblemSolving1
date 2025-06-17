package Array.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main6RRRRRR {

    public static List<Integer> solution(int n, int[] arr) {
        List<Integer> answers = new ArrayList<>();
        for(int a : arr) {
            StringBuilder sb = new StringBuilder(String.valueOf(a)).reverse();
            Integer number = Integer.valueOf(sb.toString());

            if(number > 1) {
                if(number == 2 || number == 3) {
                    answers.add(number);
                } else {
                    boolean flag = false;
                    for (int i = 2; i < number ; i++) {
                        if(number % i == 0) {
                            flag = true;
                            break;
                        }
                    }
                    if(!flag) {
                        answers.add(number);
                    }
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

        for(int x : solution(n,arr)) {
            System.out.print(x + " ");
        }
    }
}
