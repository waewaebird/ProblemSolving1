package GreedyAlgorithm.rev;

import java.util.*;

public class Main4RRRRRRRRRRR {
    static class Lecture implements Comparable<Lecture> {
        int money;
        int day;

        public Lecture(int money, int day) {
            this.money = money;
            this.day = day;
        }

        @Override
        public int compareTo(Lecture o) {
            return Integer.compare(o.day, this.day);
        }
    }

    public static int solution(List<Lecture> list) {
        int answer = 0;

        list.sort(null);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int max = list.get(0).day;

        for (int i = max; i >= 1; i--) {
            for(Lecture l : list) {
                if(l.day == i) {
                    pq.offer(l.money);
                } else if(l.day < i) {
                    break;
                }
            }

            if(!pq.isEmpty()) {
                answer += pq.poll();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        List<Lecture> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            list.add(new Lecture(a,b));
        }

        System.out.println(solution(list));
    }
}
