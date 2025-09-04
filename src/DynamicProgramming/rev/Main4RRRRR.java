package DynamicProgramming.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4RRRRR {
    // 가장 높은 탑 쌓기
    static class Brick implements Comparable<Brick>{
        int width;
        int height;
        int weight;

        public Brick(int width, int height, int weight) {
            this.width = width;
            this.height = height;
            this.weight = weight;
        }


        @Override
        public int compareTo(Brick o) {
            return Integer.compare(this.width, o.width);
        }
    }

    public static Integer solution(int n, List<Brick> list){
        int answer = 0;

        list.sort(null);
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = list.get(i).height;
        }

        for (int i = 1; i < n; i++) {
            for (int j = i-1; j >= 0 ; j--) {
                if(list.get(i).weight > list.get(j).weight) {
                    dp[i] = Math.max(dp[i], dp[j] + list.get(i).height);
                }
            }
            answer = Math.max(answer, dp[i]);
        }

        for(int x : dp) {
            System.out.println(x);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        List<Brick> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            list.add(new Brick(a,b,c));
        }

        System.out.println(solution(n,list));
    }
}
