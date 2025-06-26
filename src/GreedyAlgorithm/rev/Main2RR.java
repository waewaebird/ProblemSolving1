package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main2RR {
    // 회의실 배정
    static class Cur implements Comparable<Cur>{
        int stime;
        int etime;

        public Cur(int stime, int etime) {
            this.stime = stime;
            this.etime = etime;
        }

        @Override
        public int compareTo(Cur o) {
            if(this.etime == o.etime) {
                return Integer.compare(this.stime, o.stime);
            } else {
                return Integer.compare(this.etime, o.etime);
            }
        }
    }

    public static Integer solution(int n, List<Cur> list) {
        Integer answer = 0;
        Collections.sort(list);

        int max = 0;
        for(Cur temp : list) {
            if(max == 0) {
                max = temp.etime;
                answer++;
            } else {
                if(temp.stime >= max) {
                    max = temp.etime;
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Cur> list = new ArrayList<>();

        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int st = in.nextInt();
            int et = in.nextInt();

            list.add(new Cur(st , et));

        }

        System.out.println(solution(n,list));
    }


}
