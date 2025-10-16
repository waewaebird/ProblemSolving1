package GreedyAlgorithm.rev;

import java.util.*;

public class Main4RRRRRRR {
    // 최대 수입 스케쥴
    static class Income implements Comparable<Income> {
        int money;
        int day;

        public Income(int money, int day) {
            this.money = money;
            this.day = day;
        }

        @Override
        public int compareTo(Income o) {
            return Integer.compare(o.day, this.day);
        }
    }

    public static int solution(int n, List<Income> list) {
        int answer = 0;

        list.sort(null);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int max;
        for (max = list.get(0).day; max > 0 ; max--) {
            for(Income inc : list) {
                if(inc.day == max) {
                    pq.offer(inc.money);
                } else if(inc.day < max) {
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

        List<Income> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            list.add(new Income(a,b));
        }

        System.out.println(solution(n, list));
    }
}
