package RecursiveTreeGraph.rev;

import java.util.Scanner;

public class Main4RRRRR {
    //피보나치 수열
    static int N;
    static int[] fibo;

    public static int solution(int v) {
        if(fibo[v] > 0) {
            return fibo[v];
        }
        
        if(v == 1) {
            return fibo[v] = 1;
        } else if (v == 2){
            return fibo[v] = 1;
        } else {
            return fibo[v] = solution(v-2) + solution(v-1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();

        fibo = new int[N+1];

        solution(N);

        for (int i = 1; i <= N; i++) {
            System.out.print(fibo[i] + " ");
        }
    }
}
