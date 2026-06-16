package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1RRRRRRRRRRRRRRRRRR {
    // 씨름 선수
    static class Ssi implements Comparable<Ssi> {
        int h;
        int w;

        public Ssi(int h, int w) {
            this.h = h;
            this.w = w;
        }

        @Override
        public int compareTo(Ssi o) {
            return Integer.compare(o.h, this.h);
        }
    }

    public static int solution(int n, List<Ssi> list) {
        int answer = 0;

        list.sort(null);

        int max = 0;
        for(Ssi s : list) {
            if(s.w > max) {
                max = s.w;
                answer++;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Ssi> list = new ArrayList<>();

        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            list.add(new Ssi(a,b));
        }

        System.out.println(solution(n,list));
    }
}
