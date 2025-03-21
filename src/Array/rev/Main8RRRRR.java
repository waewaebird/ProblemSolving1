package Array.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main8RRRRR {
    public static List<Integer> solution(int n, int[] arr) {
        List<Integer> answers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if(i != j) {
                    if(arr[i] < arr[j]) {
                        cnt++;
                    }
                }
            }

            answers.add(cnt);
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

        for (int x : solution(n,arr)) {
            System.out.print(x + " ");
        }
    }
}
