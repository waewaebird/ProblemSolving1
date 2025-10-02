package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1RRRRR {
    // 씨름 선수
    static class Player implements Comparable<Player>{
        int height;
        int weight;

        public Player(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }


        @Override
        public int compareTo(Player o) {
            if(o.height == this.height) {
                return Integer.compare(o.weight, this.weight);
            } else {
                return Integer.compare(o.height, this.height);
            }
        }
    }

    public static Integer solution(int n, List<Player> list) {
        int answer = 0;

        list.sort(null);

        int maxWeight = 0;
        for(Player p : list) {
            if(p.weight > maxWeight) {
                answer++;
                maxWeight = p.weight;
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
