package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3RRRR {
    // 결혼식
    static class Marry implements Comparable<Marry>{
        int time;
        char w;

        public Marry(int time, char w) {
            this.time = time;
            this.w = w;
        }

        @Override
        public int compareTo(Marry o) {
            if(this.time == o.time) {
                return Integer.compare(o.w, this.w);
            } else {
                return Integer.compare(this.time, o.time);
            }


        }
    }

    public static Integer solution(int n, List<Marry> list) {
        int answer = 0;
        int sum = 0;

        list.sort(null);
        for(Marry m : list) {
            if(m.w == 'a') {
                sum++;
            } else {
                sum--;
            }
            answer = Math.max(sum,answer);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        List<Marry> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            list.add(new Marry(a, 'a'));
            list.add(new Marry(b, 'b'));
        }

        System.out.println(solution(n, list));
    }

}
