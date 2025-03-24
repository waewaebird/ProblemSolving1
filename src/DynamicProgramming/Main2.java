package DynamicProgramming;

import java.util.Scanner;

public class Main2 {
    static int n;
    static int answer;

    public static void DFS(int v, int sum) {
        if(sum >= n) {
            answer++;
            return;
        } else {
            DFS(1, sum+1);
            DFS(2, sum+2);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();

        DFS(1,0);

        System.out.println(answer);
    }
}
