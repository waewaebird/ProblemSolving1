package GreedyAlgorithm.rev;

import java.util.*;

public class Main1RR {
    static class Player implements Comparable<Player>{
        int h;
        int w;

        public Player(int h, int w) {
            this.h = h;
            this.w = w;
        }

        @Override
        public int compareTo(Player o) {
            return Integer.compare(o.h, this.h);
        }
    }

    public static int solution(List<Player> list){
        int answer = 0;

        Collections.sort(list);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if(i == 0) {
                answer++;
                max = Math.max(max, list.get(i).w);
            } else {
                if(list.get(i).w > max) {
                    answer++;
                    max = Math.max(max, list.get(i).w);
                }
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        List<Player> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            list.add(new Player(a,b));
        }

        System.out.println(solution(list));
    }
}
