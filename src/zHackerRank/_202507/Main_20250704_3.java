package zHackerRank._202507;

import java.util.Scanner;

public class Main_20250704_3 {
    // Beautiful Triplets
    public static Integer solution(int n, int d, int[] arr) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            int lt = i;
            int rt = i+1;

            int cnt = 1;
            while (rt < n) {
                if(arr[rt] - arr[lt] == d) {
                    cnt++;
                    lt = rt;
                } else if(arr[rt] - arr[lt] > d){
                    break;
                }
                rt++;

                if(cnt == 3) {
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];

        int d = in.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(n,d,arr));
    }
}
