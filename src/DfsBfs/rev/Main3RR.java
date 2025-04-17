package DfsBfs.rev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main3RR {
    //최대점수 구하기
    static class Question implements Comparable<Question>{
        int point;
        int time;
        public Question(int point, int time) {
            this.point = point;
            this.time = time;
        }

        @Override
        public int compareTo(Question o) {
            return Integer.compare(o.point, this.point);
        }
    }

    static int N;
    static int M;
    static Question[] arr;
    static int answer = 0;

    public static void DFS(int v, int psum, int tsum) {
        if(v == N) {
            if(tsum <= M) {
                answer = Math.max(answer, psum);
            }
        } else {
            DFS(v+1, psum + arr[v].point, tsum + arr[v].time);
            DFS(v+1, psum, tsum);
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();

        arr = new Question[N];


        List<Question> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            arr[i] = new Question(a,b);

            list.add(new Question(a,b));
        }

        //DFS(0,0,0);

        //System.out.println(answer);


        Collections.sort(list);

        /*for(Question q : list) {
            System.out.println(q.point + " " + q.time);
        }*/

        int[] dy = new int[M+1]; //제한시간 설정

        for (int i = 0; i < N; i++) {
            for (int j = M; j >= list.get(i).time ; j--) {
                dy[j] = Math.max(dy[j], dy[j-list.get(i).time] + list.get(i).point);
            }
        }

        System.out.println(dy[M]);
        // 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20

        //                        25  25  25   25  25   25   25   25  25  25   25



    }
}
