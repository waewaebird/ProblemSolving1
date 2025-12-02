package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3RRRRRRRRRRRRRR {
    // 결혼식
    static class Marry implements Comparable<Marry> {
        int time;
        char word;

        public Marry(int time, char word) {
            this.time = time;
            this.word = word;
        }

        @Override
        public int compareTo(Marry o) {
            if(this.time == o.time) {
                return Integer.compare(o.word, this.word);
            } else {
                return Integer.compare(this.time, o.time);
            }
        }
    }

    public static int solution(List<Marry> list) {
        list.sort(null);

        int answer = 0;
        int cnt = 0;
        for(Marry m : list) {
            if(m.word == 'a') {
                cnt++;
            } else {
                cnt--;
            }

            answer = Math.max(answer,cnt);
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Marry> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            list.add(new Marry(a,'a'));
            list.add(new Marry(b,'b'));
        }

        System.out.println(solution(list));
    }

}
