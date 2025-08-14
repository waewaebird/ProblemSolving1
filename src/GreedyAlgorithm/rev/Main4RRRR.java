package GreedyAlgorithm.rev;

import java.util.*;

public class Main4RRRR {
    // 최대 수입 스케쥴(PriorityQueue 응용문제)
    static class Lecture implements Comparable<Lecture>{
        int money;
        int day;

        public Lecture(int money, int day) {
            this.money = money;
            this.day = day;
        }

        @Override
        public String toString() {
            return "Lecture{" +
                    "money=" + money +
                    ", day=" + day +
                    '}';
        }

        @Override
        public int compareTo(Lecture o) {
            if(o.day == this.day) {
                return Integer.compare(o.money, this.money);
            } else {
                return Integer.compare(o.day, this.day);
            }
        }
    }

    public static Integer solution(int n, List<Lecture> list, int maxDay) {
        int answer = 0;

        list.sort(null);

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        int j = 0;
        for (int i = maxDay; i >= 1 ; i--) {
            for ( ; j < n; j++) {
                if(list.get(j).day == i) {
                    queue.offer(list.get(j).money);
                } else {
                    break;
                }
            }

            if (!queue.isEmpty()) {
                answer += queue.poll();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Lecture> list =new ArrayList<>();

        int n = in.nextInt();
        int maxDay = 0;

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            maxDay = Math.max(b, maxDay);

            list.add(new Lecture(a,b));
        }

        System.out.println(solution(n,list,maxDay));
    }
}
