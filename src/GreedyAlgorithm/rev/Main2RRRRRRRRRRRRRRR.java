package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2RRRRRRRRRRRRRRR {
    // 회의실 배정
    static class Meet implements Comparable<Meet> {
        int a;
        int b;

        public Meet(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public int compareTo(Meet o) {
            if(this.b == o.b) {
                return Integer.compare(this.a, o.a);
            } else {
                return Integer.compare(this.b, o.b);
            }
        }
    }

    public static int solution(List<Meet> list) {
        list.sort(null);

        int answer = 0;

        int max = 0;
        for(Meet m : list) {
            if(m.a >= max) {
                answer++;
                max = m.b;
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

        System.out.println(solution(list));
    }
}
