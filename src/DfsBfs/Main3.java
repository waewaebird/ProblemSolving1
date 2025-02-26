package DfsBfs;

import java.util.*;

public class Main3 {
    static int answer = Integer.MIN_VALUE;
    static List<Question> list = new ArrayList<>();
    static int m;
    static int pSum = 0;
    static int tSum = 0;
    static List<Integer> answers = new ArrayList<>();
    public static class Question {
        public int point;
        public int time;
        public Question(int point, int time) {
            this.point = point;
            this.time = time;
        }
    }

    public static void DFS(int v, int pSum, int tSum) {
        if(v == list.size()) {
            if(tSum <= m) {
                answers.add(pSum);
            }
        } else {
            DFS(v+1, pSum+list.get(v).point, tSum+list.get(v).time);
            DFS(v+1, pSum, tSum);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        m = in.nextInt();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            list.add(new Question(a,b));
        }

        DFS(0,pSum,tSum);
        System.out.println(Collections.max(answers));
    }
}
