package Array.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3RRR {
    public static List<String> solution(int n, int[] a, int[] b){
        List<String> answers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if(a[i] == 1 && b[i] == 3) {
                answers.add("A");
            } else if(a[i] == 2 && b[i] == 1) {
                answers.add("A");
            } else if(a[i] == 3 && b[i] == 2) {
                answers.add("A");
            } else if(a[i] == b[i]) {
                answers.add("D");
            } else {
                answers.add("B");
            }
        }
        return answers;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = in.nextInt();
        }

        for(String s : solution(n, a, b)) {
            System.out.println(s);
        }
    }

}
