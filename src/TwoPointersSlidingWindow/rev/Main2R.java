package TwoPointersSlidingWindow.rev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main2R {
    public static List<Integer> solution(int n, int[] a, int m, int[] b) {
        List<Integer> answers = new ArrayList<>();
        int at = 0;
        int bt = 0;

        Arrays.sort(a);
        Arrays.sort(b);

        while(at < n && bt < m) {
            if(a[at] < b[bt]) {
                at++;
            } else if(a[at] > b[bt]) {
                bt++;
            } else {
                answers.add(a[at]);
                at++;
                bt++;
            }
        }

        return answers;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }


        int m = in.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = in.nextInt();
        }

        for (Integer i : solution(n,a,m,b)) {
            System.out.print(i + " ");
        }
    }

}
