package HashMapTreeSet.rev;

import java.util.*;

public class Main5RRRR {
    // K번째 큰 수

    public static Integer solution(int n, int k, int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < n; l++) {
                    if(i != j && j != l && i != l) {
                        set.add(arr[i] + arr[j] + arr[l]);
                    }
                }
            }
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int x : set) {
            queue.offer(x);
        }

        int now = -1;
        int cnt = 0;
        while(!queue.isEmpty()) {
            cnt++;
            int temp = queue.poll();

            if(cnt == k) {
                now = temp;
                break;
            }
        }

        return now;
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
