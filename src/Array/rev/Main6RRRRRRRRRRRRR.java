package Array.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main6RRRRRRRRRRRRR {
    // 뒤집은 소수
    public static List<Integer> solution(int n, int[] arr) {
        List<Integer> answers = new ArrayList<>();

        for(int x : arr) {
            int now = Integer.valueOf(new StringBuilder(String.valueOf(x)).reverse().toString());

            if(now > 1) {
                boolean flag = true;
                for (int i = 2; i <= now/2+1; i++) {
                    if(now % i == 0) {
                        flag = false;
                        break;
                    }
                }

                if(now == 2 || now == 3) {
                    flag = true;
                }

                if(flag) {
                    answers.add(now);
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

        for(int a : solution(n,arr)) {
            System.out.print(a + " ");
        }
    }
}
