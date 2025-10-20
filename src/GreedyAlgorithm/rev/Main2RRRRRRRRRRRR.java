package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2RRRRRRRRRRRR {
    // 회의실 배정
    static class Meet implements Comparable<Meet> {
        int st;
        int et;

        public Meet(int st, int et) {
            this.st = st;
            this.et = et;
        }


        @Override
        public int compareTo(Meet o) {
            if(this.et == o.et) {
                return Integer.compare(this.st, o.st);
            } else {
                return Integer.compare(this.et, o.et);
            }
        }
    }

    public static int solution(int n, List<Meet> list) {
        list.sort(null);
        int answer = 0;
        int time = 0;

        for(Meet m : list) {
            if(m.st >= time){
                answer++;
                time = m.et;
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
