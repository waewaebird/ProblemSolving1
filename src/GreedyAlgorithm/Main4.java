package GreedyAlgorithm;


import java.util.*;

class Lecture implements Comparable<Lecture>{
    int money;
    int date;
    public Lecture(int money, int date) {
        this.money = money;
        this.date = date;
    }

    @Override
    public int compareTo(Lecture o) {
        return Integer.compare(o.date, this.date);
    }
}

public class Main4 {
    public static int solution(int n, List<Lecture> list, int maxDate) {
        Collections.sort(list);
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        int answer = 0;
        int j = 0;

        for (int i = maxDate; i >= 1 ; i--) {
            //2. list 순회
            for ( ; j < n; j++) {
                if(list.get(j).date >= i) {
                    queue.offer(list.get(j).money);
                } else {
                    break;
                }
            }

            if(!queue.isEmpty()) {
                answer += queue.poll();
            }
        }
        return answer;

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        List<Lecture> list = new ArrayList<>();

        int maxDate = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int m = in.nextInt();
            int d = in.nextInt();

            list.add(new Lecture(m,d));

            maxDate = Math.max(maxDate, d);
        }
        System.out.println(solution(n, list, maxDate));
    }
}
