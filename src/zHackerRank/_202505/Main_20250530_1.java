package zHackerRank._202505;

import java.math.BigDecimal;
import java.util.*;

public class Main_20250530_1 {
    // Big Sorting
    static class Bs implements Comparable<Bs>{
        String s;

        public Bs(String s) {
            this.s = s;
        }

        @Override
        public int compareTo(Bs o) {
            if(this.s.length() == o.s.length()) {
                BigDecimal ts = new BigDecimal(this.s);
                BigDecimal os = new BigDecimal(o.s);
                return ts.compareTo(os);
            }
            return Integer.compare(this.s.length(), o.s.length());
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        List<Bs> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String str = in.next();
            list.add(new Bs(str));
        }

        Collections.sort(list);

        for(Bs x : list) {
            System.out.println(x.s);
        }
    }
}
