package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main3RR {
    //결혼식
    static class Time implements Comparable<Time>{
        int t;
        int tw;

        public Time(int t, int tw) {
            this.t = t;
            this.tw = tw;
        }

        @Override
        public int compareTo(Time o) {
            if(this.t == o.t) {
                return Integer.compare(this.tw, o.tw);
            } else {
                return Integer.compare(this.t, o.t);
            }

        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Time> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int t1 = in.nextInt();
            list.add(new Time(t1, t1));

            int t2 = in.nextInt();
            list.add(new Time(t2, t2*-1));

        }

        Collections.sort(list);

        int answer = Integer.MIN_VALUE;
        int person = 0;
        for(Time t : list) {
            if(t.tw >= 0) {
                person++;
            } else {
                person--;
            }

            answer = Math.max(answer, person);
        }

        System.out.println(answer);
    }

}

