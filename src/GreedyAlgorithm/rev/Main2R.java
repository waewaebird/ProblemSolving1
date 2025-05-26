package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main2R {
    //회의실 배정
    static class Clazz implements Comparable<Clazz>{
        int s;
        int e;

        public Clazz(int s, int e) {
            this.s = s;
            this.e = e;
        }

        @Override
        public int compareTo(Clazz o) {
            if(this.e == o.e) {
                return Integer.compare(this.s, o.s);
            } else {
                return Integer.compare(this.e, o.e);
            }

        }
    }

    public static int solution(int n, List<Clazz> list) {
        Collections.sort(list);

        int answer = 0;
        int time = 0;

        for (int i = 0; i < n; i++) {
            if(i == 0) {
                answer++;
                time = list.get(i).e;
            } else {
                if(list.get(i).s >= time) {
                    answer++;
                    time = list.get(i).e;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        List<Clazz> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            list.add(new Clazz(a,b));
        }

        System.out.println(solution(n,list));
    }
}
