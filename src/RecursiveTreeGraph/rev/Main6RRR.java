package RecursiveTreeGraph.rev;

import java.util.Scanner;

public class Main6RRR {
    static int n;
    static int[] arr;

    public static void DFS(int v) {
        if(n+1 == v) {
            String temp = "";

            for (int i = 0; i <= n ; i++) {
                if(arr[i] == 1) {
                    temp += i + " ";
                }
            }

            if(temp.length() > 0) {
                System.out.println(temp);
            }
        } else {
            arr[v] = 1;
            DFS(v+1);

            arr[v] = 0;
            DFS(v+1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        arr = new int[n+1];

        DFS(1);
    }
}
