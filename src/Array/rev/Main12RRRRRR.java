package Array.rev;

import java.util.*;

public class Main12RRRRRR {
    // 멘토링
    static class Mentos {
        int a;
        int b;

        public Mentos(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Mentos mentos = (Mentos) o;
            return a == mentos.a && b == mentos.b;
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b);
        }
    }

    public static int solution(int n, int m, int[][] arr) {
        int answer = 0;

        Set<Mentos> set = new HashSet<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    set.add(new Mentos(arr[i][j] , arr[i][k]));
                }
            }
        }

        for(Mentos men1 : set) {
            boolean flag = true;

            for(Mentos men2 : set) {
                if(men1.a == men2.b && men1.b == men2.a) {
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
