package GreedyAlgorithm.rev;

import java.util.*;

public class Main4RRRRRRRRR {
    // 최대 수입 스케쥴
    static class Lec implements Comparable<Lec> {
        int money;
        int day;

        public Lec(int money, int day) {
            this.money = money;
            this.day = day;
        }

        @Override
        public int compareTo(Lec o) {
            return Integer.compare(o.day, this.day);
        }
    }

    public static int solution(int n, List<Lec> list) {
        int answer = 0;

        list.sort(null);

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int maxday = list.get(0).day;
        int index = 0;
        for (int i = maxday; i >= 1; i--) {
            for (; index < list.size(); index++) {
                if(list.get(index).day == i) {
                    pq.offer(list.get(index).money);
                } else {
                    //index--;
                    break;
                }
            }

            if(pq.size() > 0) {
                answer += pq.poll();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        List<Lec> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            list.add(new Lec(a,b));
        }

        System.out.println(solution(n,list));
    }
}
