package TwoPointersSlidingWindow.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1RRR {
    public static List<Integer> solution(int n, int[] nn, int m, int[] mm) {
        List<Integer> list = new ArrayList<>();
        int nt = 0;
        int mt = 0;

        while(nt < nn.length && mt < mm.length) {
            if(nn[nt] < mm[mt]) {
                list.add(nn[nt]);
                nt++;
            } else if(nn[nt] > mm[mt]) {
                list.add(mm[mt]);
                mt++;
            } else {
                list.add(nn[nt]);
                list.add(mm[mt]);
                nt++;
                mt++;
            }
        }

        if(nt < nn.length) {
            for (int i = nt; i < nn.length; i++) {
                list.add(nn[i]);
            }
        }

        if(mt < mm.length) {
            for (int i = mt; i < mm.length; i++) {
                list.add(mm[i]);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nn = new int[n];
        for (int i = 0; i < n; i++) {
            nn[i] = in.nextInt();
        }

        int m = in.nextInt();
        int[] mm = new int[m];
        for (int i = 0; i < m; i++) {
            mm[i] = in.nextInt();
        }

        for(int x: solution(n,nn,m,mm)) {
            System.out.print(x + " ");
        }
    }

}
