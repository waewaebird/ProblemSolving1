package Array.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main6RRRRRRRR {
    // 뒤집은 소수
    public static List<Integer> solution(int n, int[] arr) {
        List<Integer> answers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String nowValue = new StringBuilder(String.valueOf(arr[i])).reverse().toString();

            Integer num = Integer.parseInt(nowValue);

            if(num > 1) {
                boolean flag = false;
                for (int j = 2; j < num; j++) {
                    if(num % j == 0) {
                        flag = true;
                    }
                }

                if(!flag) {
                    answers.add(num);
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

        for(Integer x : solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
