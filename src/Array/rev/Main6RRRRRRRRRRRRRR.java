package Array.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main6RRRRRRRRRRRRRR {
    // 뒤집은 소수
    public static List<Integer> solution(int n, int[] arr) {
        List<Integer> answers = new ArrayList<>();

        for(int x : arr) {

            String re = new StringBuilder(String.valueOf(x)).reverse().toString();
            int number = Integer.valueOf(re);

            if(number > 1) {
                boolean flag = true;

                for (int i = 2; i < number ; i++) {
                    if(number % i == 0) {
                        flag = false;
                        break;
                    }
                }

                if(number == 2 || number == 3) {
                    flag = true;
                }

                if(flag) {
                    answers.add(number);
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

        List<Integer> aaa = solution(n,arr);

        int cnt = 0;
        for(int x : aaa) {
            cnt++;

            if(cnt == aaa.size()) {
                System.out.print(x);
            } else {
                System.out.print(x + " ");
            }

        }
    }
}
