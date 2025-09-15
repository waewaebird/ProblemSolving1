package GreedyAlgorithm.rev;

import java.util.*;

public class Main2RRRRRRR {
    static class Meeting implements Comparable<Meeting>{
        int start;
        int end;

        public Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }


        @Override
        public int compareTo(Meeting o) {
            if(this.end == o.end) {
                return Integer.compare(this.start, o.start);
            } else {
                return Integer.compare(this.end, o.end);
            }
        }
    }

    public static Integer solution(int n, List<Meeting> list) {
        Integer answer = 0;

        list.sort(Comparator.naturalOrder());

        int max = 0;
        for(Meeting m : list) {
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
        List<Meeting> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int s = in.nextInt();
            int e = in.nextInt();

            list.add(new Meeting(s,e));
        }

        System.out.println(solution(n,list));
    }
}
