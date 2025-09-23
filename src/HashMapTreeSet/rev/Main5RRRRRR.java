package HashMapTreeSet.rev;

import java.util.*;

public class Main5RRRRRR {
    // K번째 큰 수
    public static Integer solution(int n, int k, int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int l = j+1; l < n; l++) {
                    set.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }


        for(int num : set) {
            pq.offer(num);
        }

        int answer = -1;
        int cnt = 0;
        while(!pq.isEmpty()) {
            cnt++;
            int number = pq.poll();

            if(cnt == k) {
                answer = number;
            }
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
