package TwoPointersSlidingWindow.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1RR {
    public static List<Integer> solution(int a, int[] aa, int b, int[]bb) {
        List<Integer> answers = new ArrayList<>();
        int at = 0;
        int bt = 0;

        while(at < aa.length && bt < bb.length) {
            if(aa[at] < bb[bt]) {
                answers.add(aa[at]);
                at++;
            } else {
                answers.add(bb[bt]);
                bt++;
            }
        }

        if(at < aa.length) {
            for (int i = at; i < aa.length; i++) {
                answers.add(aa[i]);
            }
        }

        if(bt < bb.length) {
            for (int i = bt; i < bb.length; i++) {
                answers.add(bb[i]);
            }
        }

        return answers;
    }

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int a = in.nextInt();
        int[] aa = new int[a];
        for (int i = 0; i < a; i++) {
            aa[i] = in.nextInt();
        }

        int b = in.nextInt();
        int[] bb = new int[b];
        for (int i = 0; i < b; i++) {
            bb[i] = in.nextInt();
        }

        for(Integer n : solution(a, aa, b, bb)) {
            System.out.print(n + " ");
        }
    }
}
