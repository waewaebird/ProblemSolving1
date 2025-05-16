package DynamicProgramming.rev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main6RRR {

    static class Problem implements Comparable<Problem>{
        int point;
        int time;

        public Problem(int point, int time) {
            this.point = point;
            this.time = time;
        }

        @Override
        public int compareTo(Problem o) {
            return Integer.compare(o.point, this.point);
        }
    }

    public static int solution(int n, int m, List<Problem> list) {
        Collections.sort(list);
        int dy[] = new int[m+1];

        for (int i = 0; i < n; i++) {
            for (int j = m; j >= list.get(i).time ; j--) {
                dy[j] = Math.max(dy[j], dy[j-list.get(i).time] + list.get(i).point);
            }
        }
        return dy[m];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        List<Problem> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            list.add(new Problem(a,b));
        }

        System.out.println(solution(n,m,list));



    }
}
