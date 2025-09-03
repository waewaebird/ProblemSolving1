package Array.rev;

import java.util.*;

public class Main12RRR {
    static class Pair {
        int a;
        int b;

        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return a == pair.a && b == pair.b;
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b);
        }
    }


    public static Integer solution(int m, int n, int[][] arr) {
        Set<Pair> s1 = new HashSet<>();

        int answer = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    //System.out.println(arr[i][j] + " " + arr[i][k]);
                    s1.add(new Pair(arr[i][j], arr[i][k]));
                }
            }
        }

        for(Pair p1: s1) {
            boolean flag = true;
            Pair temp = new Pair(p1.b, p1.a);

            for(Pair p2: s1) {
                if(p2.equals(temp)) {
                    flag = false;
                    break;
                }
            }

            if(flag) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int arr[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(solution(m,n,arr));
    }
}
