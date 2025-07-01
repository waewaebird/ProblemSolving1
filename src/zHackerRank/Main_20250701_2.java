package zHackerRank;

import java.util.*;

public class Main_20250701_2 {
    // Breadth First Search: Shortest Reach
    static class Edges {
        int v1;
        public Edges(int v1) {
            this.v1 = v1;
        }
    }

    public static List<Integer> solution(int n, int m, List<Set<Edges>> list, int start) {
        int[] answers = new int[n+1];

        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(start);

        int level = 1;
        while(!queue.isEmpty()) {
            int len = queue.size();

            for (int i = 0; i < len; i++) {
                Integer temp = queue.poll();

                for(Edges e : list.get(temp)) {
                    if(answers[e.v1] == 0) {
                        if(list.get(e.v1).size() > 0) {
                            queue.offer(e.v1);
                        }
                        answers[e.v1] = level;
                    }
                }
            }
            level++;
        }

        List<Integer> ret = new ArrayList<>();
        for (int i = 1; i <= n ; i++) {
            if(i != start) {
                if(answers[i] == 0) {
                    ret.add(-1);
                } else {
                    ret.add(answers[i] * 6);
                }
            }
        }
        return ret;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int q = in.nextInt();

        List<List<Integer>> answers = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            List<Set<Edges>> list = new ArrayList<>();

            int n = in.nextInt(); // nodes
            int m = in.nextInt(); // edges

            for (int j = 0; j <= n; j++) {
                list.add(new HashSet<>());
            }

            for (int j = 0; j < m; j++) {
                int a = in.nextInt();
                int b = in.nextInt();

                list.get(a).add(new Edges(b));
                list.get(b).add(new Edges(a));
            }

            int start = in.nextInt();

            answers.add(solution(n,m,list,start));
        }

        for(List<Integer> answer : answers) {
            for(Integer x : answer) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

    }
}
