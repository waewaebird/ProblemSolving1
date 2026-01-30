package DynamicProgramming.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4RRRRRRRRRR {
    // 가장 높은 탑 쌓기
    static class Tower implements Comparable<Tower> {
        int width;
        int height;
        int weight;

        public Tower(int width, int height, int weight) {
            this.width = width;
            this.height = height;
            this.weight = weight;
        }

        @Override
        public int compareTo(Tower o) {
            return Integer.compare(this.weight, o.weight);
        }
    }

    public static int solution(int n, List<Tower> list) {
        int answer = 0;
        list.sort(null);
        int[] dp = new int[n];

        int index = 0;
        for(Tower t : list) {
            dp[index] = t.height;
            index++;
        }

        for (int i = 1; i < n; i++) {
            for (int j = i-1; j >= 0; j--) {
                if(list.get(i).width > list.get(j).width) {
                    dp[i] = Math.max(dp[i], dp[j] + list.get(i).height);
                }
            }
            answer = Math.max(answer, dp[i]);
        }

        return answer;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Tower> list = new ArrayList<>();

        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            list.add(new Tower(a,b,c));
        }

        System.out.println(solution(n,list));
    }
}
