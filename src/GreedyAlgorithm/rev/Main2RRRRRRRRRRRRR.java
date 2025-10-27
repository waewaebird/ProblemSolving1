package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2RRRRRRRRRRRRR {
    // 회의실 배정
    static class Meet implements Comparable<Meet> {
        int s;
        int e;

        public Meet(int s, int e) {
            this.s = s;
            this.e = e;
        }

        @Override
        public int compareTo(Meet o) {
            if(this.e == o.e) {
                return Integer.compare(this.s, o.s);
            } else {
                return Integer.compare(this.e, o.e);
            }
        }
    }

    public static int solution(int n, List<Meet> list) {
        list.sort(null);

        int answer = 0;
        int max = 0;
        for(Meet m : list) {
            if(m.s >= max) {
                answer++;
                max = m.e;
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
