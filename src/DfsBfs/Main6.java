package DfsBfs;

import java.util.Scanner;

public class Main6 {
    static int n;
    static int m;
    static Ms[] arr;
    static int[] answer;

    public static class Ms {
        int value;
        int cnt;

        public Ms(int value, int cnt) {
            this.value = value;
            this.cnt = cnt;
        }
    }


    public static void DFS(int v) {
        if(v == m) {
            for(int x : answer) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if(arr[i].cnt == 0) {
                    arr[i].cnt = 1;
                    answer[v] = arr[i].value; //계속 오버라이드 됨
                    DFS(v+1);
                    arr[i].cnt = 0;
                }
            }


            /*for (int i = v; i < n; i++) {
                arr[i].cnt = 1;
                for (int j = 0; j < n; j++) {
                    if(i != j) {
                        arr[j].cnt = 1;
                        DFS(j, cnt+1, i);
                        arr[j].cnt = 0;
                    }
                }
                arr[i].cnt = 0;
            }*/
        }
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();

        arr = new Ms[n];
        answer = new int[m];

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = 0;

            arr[i] = new Ms(a,b);
        }

        DFS(0);

    }
}
