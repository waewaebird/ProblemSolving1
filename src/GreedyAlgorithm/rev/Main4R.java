package GreedyAlgorithm.rev;

import java.util.*;

public class Main4R {
    // 최대 수입 스케쥴(PriorityQueue 응용문제)
    static class Show implements Comparable<Show> {
        int money;
        int day;

        public Show(int money, int day) {
            this.money = money;
            this.day = day;
        }

        @Override
        public int compareTo(Show o) {
            return Integer.compare(o.day , this.day);
        }
    }

    public static Integer solution(int n, List<Show> list, int max) {
        Integer answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        Collections.sort(list); // 날짜순 내림차순

        int j = 0;
        for (int i = max; i >= 1; i--) {
            for (; j < n; j++) {
                if(list.get(j).day < i) {
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
        List<Show> list = new ArrayList<>();

        int max = 0;
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            list.add(new Show(a,b));
            max = Math.max(b,max);
        }

        System.out.println(solution(n,list,max));
    }
}
