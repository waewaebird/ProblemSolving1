package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1RRRRRRRRR {
    // 씨름 선수
    static class Ss implements Comparable<Ss> {
        int height;
        int weight;

        public Ss(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }


        @Override
        public int compareTo(Ss o) {
            return Integer.compare(o.height, this.height);
        }
    }

    public static int solution(int n, List<Ss> list) {
        int answer = 0;

        list.sort(null);

        int maxW = 0;
        for(Ss s : list) {
            if(s.weight > maxW) {
                maxW = s.weight;
                answer++;
            }
        }
        return answer;
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

        System.out.println(solution(n,list));
    }
}
