package StackQueue.rev;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main6R {
    public static int solution(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        int cnt = 0;
        while(!queue.isEmpty()) {
            cnt++;

            int temp = queue.poll();

            if(cnt != k) {
                queue.offer(temp);
            } else if(cnt == k) {
                cnt = 0;
            }

            if(queue.size() == 1){
                break;
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
