package zHackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_20250829_1 {
    // The Full Counting Sort
    static class Ace implements Comparable<Ace>{
        int index;
        String word;

        public Ace(int index, String word) {
            this.index = index;
            this.word = word;
        }

        @Override
        public int compareTo(Ace o) {
            return Integer.compare(this.index, o.index);
        }
    }

    public static String solution(int n, List<Ace> list) {
        StringBuilder sb = new StringBuilder("");

        int mid = n / 2;
        for (int i = 0; i < n; i++) {
            if(i < mid) {
                list.get(i).word = "-";
            }
        }

        list.sort(null);

        for (int i = 0; i < n; i++) {
            sb.append(list.get(i).word + " ");
        }


        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Ace> list = new ArrayList<>();

        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            String str = in.next();

            list.add(new Ace(a,str));
        }

        System.out.println(solution(n,list));

    }
}
