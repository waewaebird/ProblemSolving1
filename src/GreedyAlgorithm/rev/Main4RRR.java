package GreedyAlgorithm.rev;

import java.util.*;

public class Main4RRR {
    // 최대 수입 스케쥴(PriorityQueue 응용문제)
    static class Talk implements Comparable<Talk> {
        int money;
        int date;

        public Talk(int money, int date) {
            this.money = money;
            this.date = date;
        }

        @Override
        public int compareTo(Talk o) {
            return Integer.compare(o.date, this.date);
        }
    }

    public static Integer solution(int n, List<Talk> list) {
        list.sort(null);

        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int max = list.get(0).date;

        int answer = 0;
        int j = 0;
        for (int i = max; i >= 1 ; i--) {
            for ( ; j < n; j++) {
                if(list.get(j).date >= i) {
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
        List<Talk> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            list.add(new Talk(a,b));
        }

        System.out.println(solution(n,list));
    }
}
