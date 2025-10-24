package GreedyAlgorithm.rev;

import java.util.*;

public class Main4RRRRRRRR {
    // 최대 수입 스케쥴
    static class Sch implements Comparable<Sch> {
        int money;
        int day;

        public Sch(int money, int day) {
            this.money = money;
            this.day = day;
        }

        @Override
        public int compareTo(Sch o) {
            return Integer.compare(o.day, this.day);
        }
    }

    public static int solution(int n, List<Sch> list) {
        int answer = 0;

        list.sort(null);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int max = list.get(0).day;
        for (int i = max; i > 0; i--) {
            for(Sch s : list) {
                if(s.day == i) {
                    pq.offer(s.money);
                } else if(s.day < i){
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

        List<Sch> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            list.add(new Sch(a,b));
        }

        System.out.println(solution(n,list));
    }
}
