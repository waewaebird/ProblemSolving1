package DfsBfs;

import java.util.Scanner;

// 0 1 2 3 : B
// 3C0 3C1 3C2 3C3
// 1  3    3   1


// 0 1 2 3  4 : B
// 4C0 4C1 4C2 4C3 4c4
// 1    4      6    4  1


public class Main8A {
    static int[] b, p, ch; //컴비네이션 값, 순열,  체크
    static int n,f;
    boolean flag =false;
    int[][] dy = new int[35][35];

    public int combi(int n, int r) {
        if(dy[n][r] > 0) {
            return dy[n][r];
        }
        if(n == r || r == 0) {
            return 1;
        } else {
            return combi(n-1,r-1) + combi(n-1,r);
        }
    }

    public void DFS(int L, int sum) {
        if(flag == true) {
            return;
        }

        if(L == n) {
            if(sum == f) {
                for(int x : p) {
                    System.out.print(x + " ");
                }
                flag = true;
            }
        } else {
            for (int i = 1; i <= n; i++) { //순열을 만드는 숫자 (인덱스 아님)
                if(ch[i] == 0) {
                    ch[i] = 1;
                    p[L] = i;
                    DFS(L + 1, sum+(p[L]*b[L]));
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main8A T = new Main8A();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        f = kb.nextInt();
        b = new int[n];
        p = new int[n];
        ch = new int[n+1]; //체크가 숫자를 1부터 사용해야함. 인덱스 번호가 실제값
        for (int i = 0; i < n; i++) {
            b[i] = T.combi(n-1, i);
        }
        T.DFS(0,0);

    }


}
