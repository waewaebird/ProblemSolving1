package TwoPointersSlidingWindow.rev;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main1RRRRR {
    // 두 배열 합치기
    public static PriorityQueue<Integer> solution(int[] arr1, int[] arr2) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int x : arr1) {
            queue.offer(x);
        }

        for(int x : arr2) {
            queue.offer(x);
        }

        return queue;
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

        PriorityQueue<Integer> answer = solution(arr1,arr2);

        while(!answer.isEmpty()) {
            System.out.print(answer.poll() + " ");
        }
    }
}
