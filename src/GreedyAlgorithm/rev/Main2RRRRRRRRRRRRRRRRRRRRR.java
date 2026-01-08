package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2RRRRRRRRRRRRRRRRRRRRR {
    // 회의실 배정
    static class Meet implements Comparable<Meet> {
        int start;
        int end;

        public Meet(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Meet o) {
            if(this.end == o.end) {
                return Integer.compare(this.start, o.start);
            } else {
                return Integer.compare(this.end, o.end);
            }
        }
    }

    public static int solution(List<Meet> list) {
        list.sort(null);

        int max = 0;
        int answer = 0;
        for(Meet m : list) {
            if(m.start >= max) {
                answer++;
                max = m.end;
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

            list.add(new Meet(a, b));
        }

        System.out.println(solution(list));
    }
}
