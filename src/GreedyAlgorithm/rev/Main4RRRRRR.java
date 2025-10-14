package GreedyAlgorithm.rev;

import java.util.*;

public class Main4RRRRRR {
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
            if(o.day == this.day) {
                return Integer.compare(o.money, this.money);
            } else {
                return Integer.compare(o.day, this.day);
            }
        }
    }

    public static int solution(int n, List<Sch> list) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        list.sort(null);

        int i;
        for(i = list.get(0).day ; i > 0 ; i--) {
            for(Sch s : list) {
                if(s.day == i) {
                    pq.offer(s.money);
                } else if(s.day < i) {
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

        List<Sch> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            list.add(new Sch(a,b));
        }

        System.out.println(solution(n,list));
    }
}
