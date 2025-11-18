package StackQueue.rev;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main6RRRRRRR {
    // 공주 구하기
    public static int solution(int n, int k) {
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        int cnt = 0;
        while(queue.size() > 1) {
            cnt++;
            int now = queue.poll();

            if(cnt == k) {
                cnt = 0;
            } else {
                queue.offer(now);
            }
        }

        return queue.poll();
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        System.out.println(solution(n,k));
    }
}
