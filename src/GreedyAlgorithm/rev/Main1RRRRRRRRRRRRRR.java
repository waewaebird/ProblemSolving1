package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1RRRRRRRRRRRRRR {
    static class Player implements Comparable<Player> {
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

    public static int solution(int n, List<Player> list) {
        list.sort(null);

        int answer = 0;

        int max = 0;
        for(Player p : list) {
            if(p.w > max) {
                answer++;
                max = p.w;
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

        System.out.println(solution(n,list));
    }
}
