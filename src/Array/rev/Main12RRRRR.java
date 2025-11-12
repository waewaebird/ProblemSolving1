package Array.rev;

import java.util.*;

public class Main12RRRRR {
    // 멘토링
    static class Mento {
        int a;
        int b;

        public Mento(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Mento mento = (Mento) o;
            return a == mento.a && b == mento.b;
        }

        @Override
        public int hashCode() {
            return a+b;
        }
    }

    public static int solution(int n, int m, int[][] arr) {
        Set<Mento> sets = new HashSet<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    sets.add(new Mento(arr[i][j], arr[i][k]));
                }
            }
        }

        int answer = 0;
        for(Mento a1 : sets) {
            boolean flag = true;
            for(Mento a2 :sets) {
                if(a1.a == a2.b && a1.b == a2.a) {
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

        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(solution(n,m,arr));
    }
}
