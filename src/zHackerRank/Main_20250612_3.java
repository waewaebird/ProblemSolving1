package zHackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_20250612_3 {
    // Chocolate Feast
    public static Integer solution(int n, int c, int m) {
        int answer = 0;

        int money = n;
        int wrapper = 0;
        while(money >= c) {
            answer += money / c;

            wrapper += money / c;
            money = money % c + (wrapper/m) * c;
            wrapper = wrapper % m;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        List<Integer> answers = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();

            answers.add(solution(n,c,m));
        }

        for(int x : answers) {
            System.out.println(x);
        }
    }
}
