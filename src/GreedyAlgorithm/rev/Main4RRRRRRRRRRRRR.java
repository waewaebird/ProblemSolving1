package GreedyAlgorithm.rev;

import java.util.*;

public class Main4RRRRRRRRRRRRR {
    // 최대 수입 스케쥴
    static class Lect implements Comparable<Lect> {
        int money;
        int date;

        public Lect(int money, int date) {
            this.money = money;
            this.date = date;
        }


        @Override
        public int compareTo(Lect o) {
            return Integer.compare(o.date, this.date);
        }
    }

    public static int solution(int n, List<Lect> list) {
        int answer = 0;

        list.sort(null);

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int max = list.get(0).date;

        int j = 0;
        for (int i = max; i >= 1; i--) {
            for (; j < n; j++) {
                if(list.get(j).date == i) {
                    pq.offer(list.get(j).money);
                } else if(list.get(j).date < i) {
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

        List<Lect> list = new ArrayList<>();

        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            list.add(new Lect(a,b));
        }

        System.out.println(solution(n,list));
    }
}
