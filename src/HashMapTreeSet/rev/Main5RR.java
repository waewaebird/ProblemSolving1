package HashMapTreeSet.rev;

import java.util.*;

public class Main5RR {
    // K번째 큰 수
    static int N;
    static int K;
    static Integer[] arr;
    static int[] sum = new int[3];
    static Set<Integer> sets = new HashSet<>();

    public static void DFS(int v, int start) {
        if(v == 3) {
            int temp = 0;
            for(int x: sum) {
                temp += x;
            }
            sets.add(temp);
            return;
        } else {
            for (int i = start; i < N; i++) {
                sum[v] = arr[i];
                DFS(v+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        K = in.nextInt();
        arr = new Integer[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        DFS(0,0);


        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(Integer x : sets) {
            pq.offer(x);
        }

        boolean isEnd = false;
        int cnt = 1;
        while(!pq.isEmpty()) {
            int temp = pq.poll();

            if(cnt == K) {
                System.out.println(temp);
                isEnd = true;
                break;
            }
            cnt++;
        }

        if(!isEnd) {
            System.out.println(-1);
        }
    }

}

