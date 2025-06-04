package zHackerRank._202505;

import java.util.Arrays;
import java.util.Scanner;

public class Main_20250515_1 {
    // Utopian Tree
    public static int[] solution(int n, int[] arr) {
        int[] temp = Arrays.copyOf(arr, arr.length);

        Arrays.sort(temp);

        int[] answers = new int[temp[n-1] +1];

        for (int i = 0; i < answers.length; i++) {
            if(i == 0) {
                answers[i] = 1;
            } else {
                if(i % 2 == 0) {
                    answers[i] = answers[i-1] + 1;
                } else {
                    answers[i] = answers[i-1] * 2;
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

        int[] answers = solution(n,  arr);

        for(int x: arr) {
            System.out.println(answers[x]);
        }
    }
}
