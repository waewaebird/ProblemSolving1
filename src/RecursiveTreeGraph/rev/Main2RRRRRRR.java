package RecursiveTreeGraph.rev;

import java.util.Scanner;

public class Main2RRRRRRR {
    // 재귀함수를 이용한 이진수 출력
    public static void DFS(int n) {
        if(n == 1) {
            System.out.print(1);
        } else {
            DFS(n/2);
            System.out.print(n%2);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        DFS(n);
    }
}
