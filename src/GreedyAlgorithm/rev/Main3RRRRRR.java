package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3RRRRRR {
    // 결혼식
    static class Wedding implements Comparable<Wedding>{
        int time;
        char act;

        public Wedding(int time, char act) {
            this.time = time;
            this.act = act;
        }

        @Override
        public int compareTo(Wedding o) {
            if(this.time == o.time) {
                return Integer.compare(o.act, this.act);
            } else {
                return Integer.compare(this.time, o.time);
            }
        }
    }

    public static Integer solution(List<Wedding> list) {
        int answer = 0;

        list.sort(null);

        int cnt = 0;
        for(Wedding w : list) {
            if(w.act == 'a') {
                cnt++;
            } else {
                cnt--;
            }
            answer = Math.max(cnt, answer);
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

        System.out.println(solution(list));
    }
}
