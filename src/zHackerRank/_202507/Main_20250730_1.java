package zHackerRank._202507;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_20250730_1 {
    // Jim and the Orders
    static class Order implements Comparable<Order> {
        int index;
        int order;
        int prep;

        public Order(int index, int order, int prep) {
            this.index = index;
            this.order = order;
            this.prep = prep;
        }

        @Override
        public int compareTo(Order o) {
            int tsum = this.order + this.prep;
            int osum = o.order + o.prep;

            return Integer.compare(tsum, osum);
        }
    }

    public static List<Integer> solution(int n, List<Order> list) {
        List<Integer> answers = new ArrayList<>();

        list.sort(null);

        for (int i = 0; i < n; i++) {
            answers.add(list.get(i).index);
        }

        return answers;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        List<Order> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int c = i+1;
            int a = in.nextInt();
            int b = in.nextInt();

            list.add(new Order(c,a,b));
        }

        for(int x : solution(n,list)) {
            System.out.print(x + " ");
        }
    }
}
