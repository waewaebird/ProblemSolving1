package StackQueue.rev;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main6RRRRRR {
    // 공주 구하기
    public static int solution(int n, int m) {
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        int cnt = 0;
        while(queue.size() > 1) {
            cnt++;
            int number = queue.poll();

            if(cnt != m) {
                queue.offer(number);
            } else {
                cnt = 0;
            }
        }

        return queue.poll();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        System.out.println(solution(n,m));
    }
}
