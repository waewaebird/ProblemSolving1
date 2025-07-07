package GreedyAlgorithm.rev;

import java.util.*;

public class Main4RR {
    // 최대 수입 스케쥴(PriorityQueue 응용문제)
    static class Clazz implements Comparable<Clazz>{
        int money;
        int date;
        public Clazz(int money, int date) {
            this.money = money;
            this.date = date;
        }
        @Override
        public int compareTo(Clazz o) {
            return Integer.compare(o.date, this.date);
        }
    }

    public static Integer solution(int n, List<Clazz> list, int maxDate) {
        int answer = 0;

        Collections.sort(list);
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int j = 0;
        for (int i = maxDate; i >= 1 ; i--) {
            for (; j < n ; j++) {
                if(list.get(j).date < i) {
                    break;
                }
                pq.offer(list.get(j).money);
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

        List<Clazz> list = new ArrayList<>();

        int maxDate = 0;
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            maxDate = Math.max(maxDate, b);

            list.add(new Clazz(a,b));
        }

        System.out.println(solution(n,list,maxDate));
    }
}
