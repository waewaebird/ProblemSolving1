package TwoPointersSlidingWindow.rev;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main1RRRRRR {
    // 두 배열 합치기
    public static int[] solution(int n, int[] arr1, int m, int[] arr2) {
        int[] answer = new int[n+m];

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            queue.offer(arr1[i]);
        }
        for (int i = 0; i < m; i++) {
            queue.offer(arr2[i]);
        }

        for (int i = 0; i < n+m; i++) {
            answer[i] = queue.poll();
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = in.nextInt();
        }

        int m = in.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = in.nextInt();
        }

        for(int x : solution(n,arr1,m,arr2)) {
            System.out.print(x + " ");
        }

    }
}
