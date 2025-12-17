package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1RRRRRRRRRR {
    // 씨름 선수
    static class Ath implements Comparable<Ath> {
        int height;
        int weight;

        public Ath(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }

        @Override
        public int compareTo(Ath o) {
            return Integer.compare(o.height, this.height);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        List<Ath> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            list.add(new Ath(a,b));
        }

        int answer = 0;

        list.sort(null);

        int maxW = 0;
        for(Ath a : list) {
            if(a.weight > maxW) {
                maxW = a.weight;
                answer++;
            }
        }

        System.out.println(answer);
    }
}
