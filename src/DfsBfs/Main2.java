package DfsBfs;

import java.util.Scanner;

public class Main2 {
    static int c;
    static int n;
    static int[] arr;
    static int answer = 0;

    public static void DFS(int L, int sum, int[] arr) {
        if(sum > c) {
            return;
        }

        if(L == n) {
            answer = Math.max(answer, sum);
        } else {
            DFS(L+1,sum+arr[L],arr);
            DFS(L+1,sum,arr);
        }
    }

    public static void DFS(int v) {
        if(v == n) {
            int temp = 0;
            for (int i = 0; i < n; i++) {
                if(arr[i] > 0) {
                    temp += arr[i];
                }
            }
            if(temp <= c) {
                answer = Math.max(answer,temp);
            }

        } else {
            arr[v] = arr[v]*1;
            DFS(v+1);

            arr[v] = arr[v]*-1;
            DFS(v+1);
        }


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        c = in.nextInt();
        n = in.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        DFS(0);

        DFS(0,0,arr);

        System.out.println(answer);
    }
}
