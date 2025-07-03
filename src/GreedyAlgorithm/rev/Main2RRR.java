package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main2RRR {
    // 회의실 배정
    static class Meet implements Comparable<Meet> {
        int stime;
        int etime;

        public Meet(int stime, int etime) {
            this.stime = stime;
            this.etime = etime;
        }

        @Override
        public int compareTo(Meet o) {
            if(this.etime == o.etime) {
                return Integer.compare(this.stime, o.stime);
            } else {
                return Integer.compare(this.etime, o.etime);
            }
        }
    }

    public static Integer solution(int n, List<Meet> list) {
        int answer = 0;

        Collections.sort(list);

        int end = 0;
        for(Meet m : list) {
            if(end <= m.stime) {
                answer++;
                end = m.etime;
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
