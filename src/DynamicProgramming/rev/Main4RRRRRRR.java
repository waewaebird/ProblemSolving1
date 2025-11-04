package DynamicProgramming.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4RRRRRRR {
    // 가장 높은 탑 쌓기
    static class Brick implements Comparable<Brick> {
        int wid;
        int height;
        int wei;

        public Brick(int wid, int height, int wei) {
            this.wid = wid;
            this.height = height;
            this.wei = wei;
        }

        @Override
        public int compareTo(Brick o) {
            return Integer.compare(o.wid, this.wid);
        }
    }

    public static int solution(int n, List<Brick> list) {
        int answer = 0;
        list.sort(null);

        int[] dp = new int[n];
        int index = 0;
        for(Brick b : list) {
            dp[index] = b.height;
            //System.out.println(b.wid + " " + b.height + " " + b.wei);
            index++;
        }

        for (int i = 1; i < n; i++) {
            for (int j = i-1; j >= 0; j--) {
                if(list.get(i).wei < list.get(j).wei){
                    int hh = list.get(i).height + dp[j];
                    dp[i] = Math.max(dp[i], hh);
                }
            }

            answer = Math.max(answer, dp[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Brick> list = new ArrayList<>();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            list.add(new Brick(a,b,c));
        }

        System.out.println(solution(n,list));
    }
}
