package zHackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_20250514_1 {
    public static List<Integer> solution(int start, int end, int apple, int orange, int aCnt, int oCnt, int[] apples, int[] orages) {
        List<Integer> answers = new ArrayList<>();

        int a = 0;
        for (int x : apples) {
            int temp = apple+x;
            if(temp >= start && temp <= end) {
                a++;
            }
        }
        answers.add(a);

        int b = 0;
        for (int x : orages) {
            int temp = orange+x;
            if(temp >= start && temp <= end) {
                b++;
            }
        }
        answers.add(b);

        return answers;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int start = in.nextInt();
        int end = in.nextInt();

        int apple = in.nextInt();
        int orange = in.nextInt();

        int aCnt = in.nextInt();
        int[] apples = new int[aCnt];

        int oCnt = in.nextInt();
        int[] orages = new int[oCnt];

        for (int i = 0; i < aCnt; i++) {
            apples[i] = in.nextInt();
        }

        for (int i = 0; i < oCnt; i++) {
            orages[i] = in.nextInt();
        }

        for(int x : solution(start,end,apple,orange,aCnt,oCnt,apples,orages)) {
            System.out.println(x);
        }
    }
}
