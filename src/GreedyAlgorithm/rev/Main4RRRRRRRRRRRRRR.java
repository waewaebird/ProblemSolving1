package GreedyAlgorithm.rev;

import java.util.*;

public class Main4RRRRRRRRRRRRRR {
     // 최대 수입 스케쥴
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

    public static int solution(int n, List<Lecture> list) {
        int answer = 0;
        list.sort(null);

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        int max = list.get(0).day;

        int j = 0;
        for (int i = max; i >= 1; i--) {
            for (; j < n ; j++) {

                if(list.get(j).day == i) {
                    pq.offer(list.get(j).money);
                } else {
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

        System.out.println(solution(n,list));

    }
}
