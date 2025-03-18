package GreedyAlgorithm.rev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Party implements Comparable<Party>{
    int time;
    char key;

    public Party(int time, char key) {
        this.time = time;
        this.key = key;
    }

    @Override
    public int compareTo(Party o) {
        if(this.time == o.time) {
            return this.key - o.key;
        } else {
            return this.time - o.time;
        }


    }
}

public class Main3R {

    public static int solution(List<Party> list) {
        Collections.sort(list);

        int answer = Integer.MIN_VALUE;
        int cnt = 0;
        for(Party x : list) {
            if(x.key == 's') {
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
        List<Party> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            list.add(new Party(a,'s'));
            list.add(new Party(b,'e'));
        }

        System.out.println(solution(list));
    }
}
