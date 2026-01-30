package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1RRRRRRRRRRRRRRRR {
    // 씨름 선수
    static class Ss implements Comparable<Ss> {
        int h;
        int w;

        public Ss(int h, int w) {
            this.h = h;
            this.w = w;
        }

        @Override
        public int compareTo(Ss o) {
            return Integer.compare(o.h, this.h);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        List<Ss> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            list.add(new Ss(a,b));
        }

        list.sort(null);

        int answer = 0;
        int max = 0;
        for(Ss s : list) {
            if(s.w >= max) {
                max = s.w;
                answer++;
            }
        }

        System.out.println(answer);
    }
}
