package TwoPointersSlidingWindow.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1RRRRRRR {
    public static List<Integer> solution(int n, int[] narr, int m, int[] marr) {
        List<Integer> answers = new ArrayList<>();
        
        int nt = 0;
        int mt = 0;
        while(nt < n && mt < m) {
            if(narr[nt] < marr[mt]) {
                answers.add(narr[nt]);
                nt++;
            } else{
                answers.add(marr[mt]);
                mt++;
            }
        }

        if(m > n) {
            for (int i = mt; i < m; i++) {
                answers.add(marr[i]);
            }    
        } else if(m < n) {
            for (int i = nt; i < n; i++) {
                answers.add(narr[i]);
            }
        }

        return answers;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] narr = new int[n];
        for (int i = 0; i < n; i++) {
            narr[i] = in.nextInt();
        }

        int m = in.nextInt();
        int[] marr = new int[m];
        for (int i = 0; i < m; i++) {
            marr[i] = in.nextInt();
        }

        for(int x : solution(n,narr,m,marr)) {
            System.out.print(x + " ");
        }
    }
}
