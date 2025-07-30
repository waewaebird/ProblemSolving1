package Array.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main6RRRRRRRRR {
    // 뒤집은 소수
    private static List<Integer> solution(int n, int[] arr) {
        List<Integer> answers = new ArrayList<>();

        for(int x : arr) {
            String stemp = new StringBuilder(String.valueOf(x)).reverse().toString();
            Integer itemp = Integer.valueOf(stemp);

            boolean isS = true;
            for (int i = 2; i < itemp; i++) {
                if(itemp % i == 0) {
                    isS = false;
                    break;
                }
            }

            if(itemp > 1 && isS) {
                answers.add(itemp);
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
