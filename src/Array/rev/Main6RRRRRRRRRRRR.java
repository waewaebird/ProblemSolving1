package Array.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main6RRRRRRRRRRRR {
    // 뒤집은 소수
    public static List<Integer> solution(int n, int[] arr) {
        List<Integer> answers = new ArrayList<>();
        for (int x : arr) {
            Integer temp = Integer.parseInt(new StringBuilder(String.valueOf(x)).reverse().toString());

            boolean flag = false;
            for (int i = 2; i < temp/2+1; i++) {
                if(temp%i == 0) {
                    flag = true;
                    break;
                }
            }

            if(temp != 1 && !flag) {
                answers.add(temp);
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
