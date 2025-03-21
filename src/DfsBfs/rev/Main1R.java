package DfsBfs.rev;

import java.util.Scanner;

public class Main1R {
    static int n = 0;
    static int[] arr;
    static int max;
    static String answer = "NO";
    public static void DFS(int v, int sum) {
        if(answer == "YES") {
            return;
        }

        if(v == n) {
            if(max - sum == sum) {
                answer = "YES";
            }
            return;
        } else {
            DFS(v+1, sum + arr[v]);
            DFS(v+1, sum);
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            max += arr[i];
        }

        DFS(0,0);

        System.out.println(answer);
    }
}
