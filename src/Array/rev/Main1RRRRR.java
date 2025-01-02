package Array.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1RRRRR {
    public static List<Integer> solution(int n, int[] arr) {
        List<Integer> answers = new ArrayList<>();

        for(int i = 0 ; i < n ; i++) {
            if(i == 0) {
                answers.add(arr[i]);
            } else {
                if(arr[i] > arr[i-1]) {
                    answers.add(arr[i]);
                }
            }
        }
        return answers;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++) {
            arr[i] = in.nextInt();
        }

        for(int answers : solution(n, arr)) {
            System.out.print(answers + " ");
        }

    }
}
