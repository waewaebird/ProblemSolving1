package GreedyAlgorithm.rev;

import java.util.*;

public class Main6R {
    static class Relation {
        int me;
        int you;

        public Relation(int me, int you) {
            this.me = me;
            this.you = you;
        }
    }

    public static String solution(int n, int m, List<Relation> list, int a, int b) {
        String answer = "";
        Queue<Integer> queue = new LinkedList<>();
        int[] ch = new int[m];
        List<Integer> friend = new ArrayList<>();

        queue.add(a);
        while (!queue.isEmpty()) {
            int temp = queue.poll();
            for (int i = 0; i < m; i++) {
                if(ch[i] == 0) {
                    if(list.get(i).me == temp) {
                        queue.add(list.get(i).you);
                        friend.add(list.get(i).you);
                        ch[i] = 1;
                    }

                    if(list.get(i).you == temp) {
                        queue.add(list.get(i).me);
                        friend.add(list.get(i).me);
                        ch[i] = 1;
                    }
                }
            }
        }
        if(friend.contains(b)) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        List<Relation> list = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            list.add(new Relation(a,b));
        }

        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(solution(n,m,list,a,b));

    }


}
