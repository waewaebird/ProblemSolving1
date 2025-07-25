package HashMapTreeSet.rev;

import java.util.*;

public class Main5RRR {

    public static Integer solution(int n, int k, int[] arr) {
        int answer = 0;
        Set<Integer> answers = new LinkedHashSet<>();

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < n; l++) {
                    if(i != j && j != l && i != l) {
                        answers.add(arr[i] + arr[j] + arr[l]);
                    }
                }
            }
        }

        for(Integer x : answers) {
            queue.offer(x);
        }

        int cnt = 0;
        while(!queue.isEmpty()) {
            cnt++;
            int temp = queue.poll();

            if(cnt == k) {
                answer = temp;
                break;
            }
        }

        if(answer == 0) {
            answer = -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(n,k,arr));
    }
}
