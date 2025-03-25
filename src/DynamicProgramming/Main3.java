package DynamicProgramming;

import java.util.Scanner;

public class Main3 {
    static int n;
    static int[] arr;
    static int answer = Integer.MIN_VALUE;

    public static void DFS(int v, int cnt) {
        System.out.println(answer);
        if(n - v < answer) {
            return;
        }

        if(v == n-1) {
            answer = Math.max(answer, cnt);
            return;
        } else {
            for (int i = v+1; i < n; i++) {
                if(arr[v] < arr[i]) {
                    DFS(i, cnt+1);
                    DFS(i, cnt);
                } else {
                    DFS(i, cnt);
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        DFS(0,1); //0번부터 출발
        System.out.println(answer);
    }
}



/*
3
1 2 3
답 : 3

8
5 3 7 8 6 2 9 4
답 : 4

9
2 7 5 8 6 4 7 12 3
답 : 5


9
2 7 5 8 6 4 12 3

* */