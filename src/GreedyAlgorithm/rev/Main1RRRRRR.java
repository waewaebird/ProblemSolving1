package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1RRRRRR {
    // 씨름 선수
    static class Ssi implements Comparable<Ssi>{
        int height;
        int weight;

        public Ssi(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }

        @Override
        public int compareTo(Ssi o) {
            return Integer.compare(o.height, this.height);
        }
    }

    public static int solution(List<Ssi> list) {
        list.sort(null);

        int answer = 0;
        int max = 0;
        for(Ssi s: list){
            if(s.weight > max) {
                answer++;
                max = s.weight;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        List<Ssi> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            list.add(new Ssi(a,b));
        }

        System.out.println(solution(list));
    }
}
