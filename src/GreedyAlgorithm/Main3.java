package GreedyAlgorithm;

import java.util.*;

class Friend implements Comparable<Friend>{
    int start;
    int end;
    public Friend(int start, int end) {
        this.start = start;
        this.end = end;
    }
    @Override
    public int compareTo(Friend o) {
        if(this.start == o.start) {
            return Integer.compare(this.end, o.end);
        } else {
            return Integer.compare(this.start, o.start);
        }
    }
}

class Time implements Comparable<Time> {
    public int time;
    public char state;

    public Time(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Time ob) {
        if(this.time == ob.time) {
            return Integer.compare(this.state, ob.state);
        } else{
            return Integer.compare(this.time, ob.time);
        }
    }
}


public class Main3 {
    public static int solution(List<Time> arr) {
        int answer = Integer.MIN_VALUE;

        Collections.sort(arr);

        int cnt = 0;

        for(Time ob : arr) {
            if(ob.state == 's') {
                cnt++;
            } else {
                cnt--;
            }
            answer = Math.max(answer,cnt);
        }


        return answer;
    }

    public static int solution2(int n, List<Friend> list) {
        int answer = Integer.MIN_VALUE;
        int[] arr = new int[73];

        for(Friend f : list) {
            int s = f.start;
            int e = f.end;

            for (int i = s; i < e; i++) {
                arr[i]++;

                answer = Math.max(answer, arr[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        List<Friend> list = new ArrayList<>();

        List<Time> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            list.add(new Friend(a,b));
            arr.add(new Time(a,'s'));
            arr.add(new Time(b,'e'));
        }

        System.out.println(solution2(n,list));

        //System.out.println(solution(arr));
    }
}
