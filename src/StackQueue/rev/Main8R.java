package StackQueue.rev;

import java.util.*;

public class Main8R {
    // 응급실
    public static int solution(int n, int m, int[] arr) {
        List<Integer> answers = new ArrayList<>();

        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(Integer x : arr) {
            queue.offer(x);
            pq.offer(x);
        }

        int cnt = 0;
        while(!queue.isEmpty()) {
            int temp = queue.poll();

            if(pq.peek() == temp || pq.peek() == temp*-1) {
                answers.add(pq.poll());
                if(temp < 0) {
                    break;
                }
                if(cnt == m) {
                    break;
                }

            } else {
                if(cnt == m) {
                    temp = temp * -1;
                }
                queue.offer(temp);
            }
            cnt++;
        }

        return answers.size();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        int m = in.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(n,m,arr));

    }
}
