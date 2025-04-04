package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class Main5 {
    static int n;
    static int[] arr;
    static int m;
    static int answer = Integer.MAX_VALUE;

    public static void DFS(int cnt, int sum) {
        if(cnt >= answer) {
            return;
        }

        if(sum >= m) {
            if(sum == m) {
                answer = Math.min(answer, cnt);
            }
            return;
        } else {
            for (int i = n-1; i >= 0 ; i--) {
                DFS(cnt+1, sum + arr[i]);
            }
        }
    }

    public static int solution2() {
        int[] dy = new int[m+1];

        Arrays.fill(dy, Integer.MAX_VALUE);

        dy[0] = 0;

        for (int i = 0; i < n; i++) {
            for (int j = arr[i]; j <= m ; j++) {
                dy[j] = Math.min(dy[j], dy[j - arr[i] + 1]); // dy[j]원을 만드는데 코인 종류 하나를 사용하겠다. 그러니깐 그 금액만큼 빼줘야 한다, 그 금액만큼 사용한거니깐 +1
            }
        }
        return dy[m];
    }

    public static int solution() {
        int[] dy = new int[m+1];

        for (int i = 0; i <= m ; i++) {
            dy[i] = i;
        }
        for(int x: arr) {
            if(x > 1) {
                for (int j = x; j <= m ; j++) {
                    dy[j] = Math.min(dy[j], dy[j - x] + 1);
                }
            }
        }

        /*for (int i = 0; i <= m; i++) {
            System.out.print(dy[i] + " ");
        }*/


        return dy[m];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        m = in.nextInt();

        Arrays.sort(arr);

        //DFS(0,0);
        System.out.println(solution());

        //System.out.println(answer);
    }
}
