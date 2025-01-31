package Array.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main8RRR {
    public static List<Integer> solution(int n, int[] arr) {
        List<Integer> answers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int number = 1;
            for (int j = 0; j < n; j++) {
                if(arr[i] <arr[j]) {
                    number++;
                }
            }
            answers.add(number);
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

        for (Integer a : solution(n,arr)) {
            System.out.print(a + " ");
        }

    }
}
