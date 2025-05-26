package zHackerRank;

import java.util.*;

public class Main_20250526_2 {
    // ACM ICPC Team
    public static List<Integer> solution(int n, int m, int[][] arr) {
        Map<Integer, Integer> maps = new HashMap<>();
        List<Integer> answers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int cnt = 0;
                for (int k = 0; k < m; k++) {
                    if(arr[i][k] + arr[j][k] > 0) {
                        cnt++;
                    }
                }
                maps.put(cnt, maps.getOrDefault(cnt, 0) + 1);
            }
        }

        int max = Integer.MIN_VALUE;
        for(Integer key : maps.keySet()) {
            max = Math.max(max, key);
        }

        answers.add(max);
        answers.add(maps.get(max));

        return answers;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            String s = in.next();

            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.valueOf(String.valueOf(s.charAt(j)));
            }
        }

        for(int x : solution(n,m,arr)) {
            System.out.println(x);
        }
    }
}
