package StackQueue.rev;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main6RR {
    public static int solution(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        int cnt = 0;
        while (queue.size() > 1) {
            int temp = queue.poll();
            cnt++;

            if(cnt != k) {
                queue.offer(temp);
            } else if(cnt == k) {
                cnt = 0;
            }
        }

        return queue.peek();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        System.out.println(solution(n,k));
    }
}
