package TwoPointersSlidingWindow.rev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main2RR {
    public static List<Integer> solution(int a, int[] aa, int b, int[] bb) {
        List<Integer> answers = new ArrayList<>();
        int alt = 0;
        int blt = 0;
        while(true) {
            if(alt == a || blt == b) {
                break;
            }

            if(aa[alt] == bb[blt]) {
                answers.add(aa[alt]);
                alt++;
                blt++;
            } else if(aa[alt] < bb[blt]) {
                alt++;
            } else if(aa[alt] > bb[blt]) {
                blt++;
            }
        }

        return answers;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

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

        Arrays.sort(aa);
        Arrays.sort(bb);

        for(int x : solution(a,aa,b,bb)) {
            System.out.print(x + " ");
        }


    }
}
