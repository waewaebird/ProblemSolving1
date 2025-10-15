package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1RRRRRRR {
    // 씨름 선수
    static class Leum implements Comparable<Leum> {
        int h;
        int w;

        public Leum(int h, int w) {
            this.h = h;
            this.w = w;
        }

        @Override
        public int compareTo(Leum o) {
            return Integer.compare(o.h, this.h);
        }
    }

    public static int solution(int n, List<Leum> list) {
        int answer = 0;

        list.sort(null);

        int max = 0;
        for(Leum l : list) {
            if(l.w > max) {
                answer++;
                max = l.w;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Leum> list = new ArrayList<>();

        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            list.add(new Leum(a,b));
        }

        System.out.println(solution(n,list));
    }
}
