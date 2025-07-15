package zHackerRank;

import java.util.*;

public class Main_20250715_2 {
    // Largest Permutation
    public static Integer[] solution(int n, int k, Integer[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Map<Integer, Integer> maps = new HashMap<>();
        for (int i = 0; i < n; i++) {
            maps.put(arr[i],i);
            pq.offer(arr[i]);
        }

        if(k > n) {
            Arrays.sort(arr, Collections.reverseOrder());
        } else {
            int i = 0;
            while(k > 0) {
                boolean flag = true;

                for ( ; i < n; i++) {
                    if(!flag) {
                        break;
                    }
                    int max = pq.poll();
                    if(arr[i] != max) {
                        int index = maps.get(max);

                        int swap = arr[i];
                        maps.put(max, i);
                        maps.put(swap, index);
                        arr[i] = arr[index];
                        arr[index] = swap;

                        flag = false;
                    }
                }
                k--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for(int x : solution(n,k,arr)) {
            System.out.print(x + " ");
        }
    }
}
