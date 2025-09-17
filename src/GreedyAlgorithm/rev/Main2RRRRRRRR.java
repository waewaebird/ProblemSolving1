package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2RRRRRRRR {
    static class Meet implements Comparable<Meet>{
        int start;
        int end;

        public Meet(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Meet o) {
            if(this.end == o.end) {
                return java.lang.Integer.compare(this.start, o.start);
            } else {
                return java.lang.Integer.compare(this.end, o.end);
            }
        }
    }

    public static Integer solution(int n, List<Meet> list) {
        int answer = 0;

        list.sort(null);

        int max = 0;
        for(Meet m : list) {
            if(m.start >= max) {
                max = m.end;
                answer++;
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
