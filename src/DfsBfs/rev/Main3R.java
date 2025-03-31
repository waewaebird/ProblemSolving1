package DfsBfs.rev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main3R {

    static class Problem implements Comparable <Problem>{
        int point;
        int time;

        public Problem(int point, int time) {
            this.point = point;
            this.time = time;
        }

        @Override
        public int compareTo(Problem o) {
            return Integer.compare(this.point, o.point);
        }
    }

    static int n;
    static int m;
    static Problem[] arr;
    static int answer = Integer.MIN_VALUE;

    public static void DFS(int v, int time, int sum) {
        if(time > m) {
            return;
        }

        if(v == n) {
            if(time <= m) {
                answer = Math.max(answer, sum);
            }
            return;
        } else {
            DFS(v+1,time + arr[v].time, sum + arr[v].point);

            DFS(v+1,time, sum);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

        arr = new Problem[n];


        List<Problem> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            arr[i] = new Problem(a,b);

            list.add(new Problem(a,b));

        }

        DFS(0,0,0);
        System.out.println(answer);


        Collections.sort(list);

        System.out.println(list);

    }
}
