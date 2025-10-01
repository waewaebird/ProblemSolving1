package GreedyAlgorithm.rev;

import java.util.*;

public class Main4RRRRR {
    // 최대 수입 스케쥴(PriorityQueue 응용문제)
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

    public static int solution(int n, List<Lecture> list, int maxDay) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        list.sort(null);

        int k = 0;
        for (int i = maxDay; i > 0; i--) {
            for ( ; k < list.size(); k++) {
                if(list.get(k).day == i) {
                    pq.offer(list.get(k).money);
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

        int maxDay = 0;
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            list.add(new Lecture(a,b));
            maxDay = Math.max(maxDay, b);
        }

        System.out.println(solution(n,list,maxDay));
    }
}
