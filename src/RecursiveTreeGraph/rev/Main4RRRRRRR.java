package RecursiveTreeGraph.rev;

import java.util.Scanner;

public class Main4RRRRRRR {
    // 피보나치 수열
    static int N;
    static int[] arr;

    public static void DFS(int v) {
        if(v == N) {
            return;
        } else if(v == 0 || v == 1){
            arr[v] = 1;
            DFS(v+1);
        } else {
            arr[v] = arr[v-1] + arr[v-2];
            DFS(v+1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        arr = new int[N];

        DFS(0);

        for(int x : arr) {
            System.out.print(x + " ");
        }
    }
}
