package GreedyAlgorithm.rev;

import java.util.*;

public class Main3RRR {
    //결혼식

    static class Party implements Comparable<Party>{
        int time;
        char word;

        public Party(int time, char word) {
            this.time = time;
            this.word = word;
        }

        @Override
        public int compareTo(Party o) {
            if(this.time == o.time) {
                return Integer.compare(this.word, o.word);
            } else {
                return Integer.compare(this.time, o.time);
            }
        }
    }

    public static int solution(List<Party> list){
        int answer = 0;
        Collections.sort(list);

        int max = 0;
        for(Party temp : list) {
            if(temp.word == 's') {
                max++;
            } else {
                max--;
            }

            answer = Math.max(max, answer);
        }

        return answer;
    }

    public static void main(String[] args) {
        List<Party> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            list.add(new Party(a, 's'));

            int b = in.nextInt();
            list.add(new Party(b, 'e'));
        }

        System.out.println(solution(list));
    }
}
