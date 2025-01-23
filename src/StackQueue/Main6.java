package StackQueue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main6 {
    public static int solution2(int n , int k) {
        int answer = 0;
        Queue<Integer> Q = new LinkedList<>();
        for(int i = 1; i <= n ; i++) {
            Q.offer(i);
        }
        while(!Q.isEmpty()) {
            for (int i = 1; i < k; i++) {
                Q.offer(Q.poll());
            }
            Q.poll();
            if(Q.size() == 1) {
                answer = Q.poll();
            }
        }

        return answer;
    }

    public static int solution(int n , int k) {
        Queue<Integer> queue = new ArrayDeque<>();

        for (int i = 1; i < n+1; i++) {
            queue.offer(i); //add와 offer의 차이
        }

        int cnt = 0;
        while(queue.size() > 1) {
            cnt++;
            Integer p = queue.poll();
            if(cnt < k) {
                queue.offer(p);
            } else if(cnt == k){
                cnt =0;
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
