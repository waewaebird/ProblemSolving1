package DynamicProgramming.rev;

import java.util.Arrays;
import java.util.Scanner;

public class Main3RR {

    public static int solution(int n, int[] arr) {
        int answer = 0;
        int[] dy = new int[n];

        dy[0] = 1;
        Arrays.fill(dy, 1);

        for (int i = 1; i < n; i++) {
            for (int j = i-1; j >=0 ; j--) {
                if(arr[i] >arr[j]) {
                    dy[i] = Math.max(dy[i], dy[j] + 1);
                }
                answer = Math.max(dy[i], answer);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(n,arr));
    }
}
