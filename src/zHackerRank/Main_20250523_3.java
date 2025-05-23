package zHackerRank;

import java.util.*;

public class Main_20250523_3 {
    // Climbing the Leaderboard
    public static void solution(int n, int m, int[] arr, int[] player) {
        List<Integer> rank = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(i == 0) {
                rank.add(arr[i]);
            } else {
                if(arr[i-1] != arr[i]) {
                    rank.add(arr[i]);
                }
            }
        }

        Map<Integer, Integer> already = new HashMap<>();
        for(int p : player) {
            if(already.containsKey(p)) {
                System.out.println(already.get(p));
            } else {

                int lt = 0;
                int rt = rank.size()-1;

                int cnt = 0;
                while(lt <= rt) {
                    int mid = (lt+rt) / 2;

                    int rankSize = rank.get(mid);

                    if(rankSize > p) {
                        lt = mid + 1;
                        cnt = mid+1;
                    } else {
                        rt = mid - 1;
                    }
                }

                already.put(p,cnt+1);
                System.out.println(cnt+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int m = in.nextInt();
        int[] player = new int[m];

        for (int i = 0; i < m; i++) {
            player[i] = in.nextInt();
        }

        solution(n,m,arr,player);
    }
}

