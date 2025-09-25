package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2RRRRRRRRR {
    // 회의실 배정
    static class Meet implements Comparable<Meet>{
        int in;
        int out;

        public Meet(int in, int out) {
            this.in = in;
            this.out = out;
        }


        @Override
        public int compareTo(Meet o) {
            if(this.out == o.out) {
                return Integer.compare(this.in, o.in);
            } else {
                return Integer.compare(this.out, o.out);
            }
        }
    }

    public static Integer solution(int n, List<Meet> list) {
        int answer = 0;

        list.sort(null);

        int end = 0;

        for(Meet m : list) {
            if(m.in >= end) {
                answer++;
                end = m.out;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        List<Meet> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            list.add(new Meet(a,b));
        }

        System.out.println(solution(n,list));
    }
}
