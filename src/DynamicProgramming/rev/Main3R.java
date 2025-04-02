package DynamicProgramming.rev;

import java.util.Arrays;
import java.util.Scanner;

public class Main3R {

    public static int solution(int n, int[] arr) {
        int[] answers = new int[n];
        answers[0] = 1;

        Arrays.fill(answers, 1);

        int answer = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            for (int j = i-1; j>=0 ; j--) {
                if(arr[i] > arr[j]) {
                    answers[i] = Math.max(answers[i], answers[j] + 1);
                }
            }
            answer = Math.max(answers[i],answer);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] =  in.nextInt();
        }

        System.out.println(solution(n,arr));

    }
}
