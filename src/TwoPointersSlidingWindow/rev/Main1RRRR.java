package TwoPointersSlidingWindow.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1RRRR {

    public static List<Integer> solution(int a, int[] arr, int b, int[] brr) {
        List<Integer> answers = new ArrayList<>();

        int at = 0;
        int bt = 0;
        while(at < a && bt < b) {
            if(arr[at] < brr[bt]) {
                answers.add(arr[at]);
                at++;
            } else {
                answers.add(brr[bt]);
                bt++;
            }
        }

        if(bt < b) {
            for (int i = bt; i < b; i++) {
                answers.add(brr[i]);
            }
        }

        if(at < a) {
            for (int i = at; i < a; i++) {
                answers.add(arr[i]);
            }
        }

        return answers;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = in.nextInt();
        }

        int b = in.nextInt();
        int[] brr = new int[b];
        for (int i = 0; i < b; i++) {
            brr[i] = in.nextInt();
        }

        for (int x : solution(a,arr,b,brr)) {
            System.out.print(x + " ");
        }


    }
}
