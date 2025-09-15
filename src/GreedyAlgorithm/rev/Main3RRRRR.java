package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3RRRRR {
    static class Wedding implements Comparable<Wedding>{
        int time;
        char x;

        public Wedding(int time, char x) {
            this.time = time;
            this.x = x;
        }


        @Override
        public int compareTo(Wedding o) {
            if(this.time == o.time) {
                return Integer.compare(o.x, this.x);
            } else {
                return Integer.compare(this.time, o.time);
            }
        }
    }

    public static Integer solution(int n, List<Wedding> list) {
        int answer = 0;
        list.sort(null);

        int cnt = 0;
        for (Wedding w : list) {
            if(w.x == 'a') {
                cnt++;
            } else {
                cnt--;
            }

            answer = Math.max(answer, cnt);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        List<Wedding> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            list.add(new Wedding(a, 'a'));
            list.add(new Wedding(b, 'b'));
        }

        System.out.println(solution(n,list));
    }
}
