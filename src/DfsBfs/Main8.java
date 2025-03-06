package DfsBfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main8 {
    static int n;
    static int f;
    static int L;
    static int[] arr;
    static int[] ch;
    static int[] pm;
    static List<List<Integer>> all;

    // 1. 총 조합을 구한다( ex : 4p!)

    // 2. 조합 하나당 파스칼그려나간다.

    // 3. 최종 16이 나온는지 확인한다.

    public static List<Integer> DFS2(List<Integer> ls) {
        if(ls.size() == 1) {
            return ls;
        } else {
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < ls.size(); i++) {
                if(i > 0) {
                    int bbc = ls.get(i) + ls.get(i-1);
                    temp.add(bbc);
                }
            }
            return DFS2(temp);
        }
    }

    public static void DFS(int L) {
        if(L == n+1) {
            List<Integer> temp = new ArrayList<>();
            for(int x : pm) {
                if(x > 0) {
                    temp.add(x);
                }
            }
            if(DFS2(temp).get(0) == f) {
                for(Integer x : temp) {
                    System.out.print(x + " ");
                }
                System.exit(0);
            }

        } else {
            for (int i = 1; i <= n; i++) {
                if(ch[i] == 0) {
                    ch[i] = 1;
                    pm[L] = arr[i];
                    DFS(L+1);
                    ch[i] = 0;
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        f = in.nextInt();

        all = new ArrayList<>();

        arr = new int[n+1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        ch = new int[n+1];
        pm = new int[n+1];

        DFS(1);
    }
}
