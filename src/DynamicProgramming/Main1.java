package DynamicProgramming;

import java.util.Scanner;

public class Main1 {
    // 직관적으로 알수있는 아주 작은 단위
    // 구해놔서 메모라이제이션 해놔서 다음값을 구할때 사용 Bottom UP
    static int n;
    static int answer;
    static int[] dy;

    public static int solution(int n) {
        dy[1] = 1;
        dy[2] = 2;
        for (int i = 3; i <= n ; i++) {
            dy[i] = dy[i-2] + dy[i-1];
        }
        return dy[n];
    }

    public static void DFS(int v, int sum) {
        if(sum >= n) {
            if(sum == n) {
                answer++;
            }
            return;
        } else {
            DFS(1, sum+1);
            DFS(2, sum+2);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();


        dy = new int[n+1];

        DFS(1,0);

        System.out.println(answer);
    }
}
