package RecursiveTreeGraph.rev;

import java.math.BigInteger;
import java.util.Scanner;

public class Main3RRR {
    // 팩토리얼
    static BigInteger answer = BigInteger.ONE;
    public static void DFS(int n) {
        if(n == 1) {
            answer = answer.multiply(new BigInteger(String.valueOf(1)));
        } else {
            answer = answer.multiply(new BigInteger(String.valueOf(n)));
            DFS(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        DFS(n);

        System.out.println(answer);
    }
}
