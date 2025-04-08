package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main1R {
    static class Play implements Comparable<Play>{
        int h;
        int w;

        public Play(int h, int w) {
            this.h = h;
            this.w = w;
        }

        @Override
        public int compareTo(Play o) {
            return Integer.compare(o.h,this.h);
        }
    }

    public static int solution(int n, List<Play> list) {
        int answer = 0;
        Collections.sort(list);

        int temp = 0;
        for (int i = 0; i < n; i++) {
            if(i == 0) {
                answer++;
                temp = list.get(i).w;
            } else {
                if(list.get(i).w > temp) {
                    temp = list.get(i).w;
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Play> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            list.add(new Play(a, b));
        }

        System.out.println(solution(n, list));
    }
}
