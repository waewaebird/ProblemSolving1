package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2RRRRR {
    // 회의실 배정
    static class Meeting implements Comparable<Meeting> {
        int s;
        int e;

        public Meeting(int s, int e) {
            this.s = s;
            this.e = e;
        }

        @Override
        public int compareTo(Meeting o) {
            if(this.e == o.e) {
                return Integer.compare(this.s, o.s);
            } else {
                return Integer.compare(this.e, o.e);
            }

        }
    }

    public static Integer solution(int n, List<Meeting> list) {
        list.sort(null);

        int answer = 0;
        int start = 0;
        for(Meeting m : list) {
            if(m.s >= start) {
                start = m.e;
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        List<Meeting> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            list.add(new Meeting(a,b));
        }

        System.out.println(solution(n,list));
    }
}
