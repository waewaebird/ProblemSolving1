package DfsBfs.rev;

import java.util.Scanner;

public class Main2R {
    static int c;
    static int n;
    static int answer = 0;
    static int sum = 0;

    public static void DFS(int v, int sum, int[] arr) {
        if(sum > c){
            return;
        }

        if(v == n) {
            answer = Math.max(answer, sum);
        } else {
            DFS(v+1, sum+arr[v], arr);
            DFS(v+1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        c = in.nextInt();
        n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        DFS(0, sum, arr);
        System.out.println(answer);
    }
}
