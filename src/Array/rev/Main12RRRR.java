package Array.rev;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Main12RRRR {
    // 멘토링
    static class Friend {
        int a;
        int b;

        public Friend(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Friend friend = (Friend) o;
            return a == friend.a && b == friend.b;
        }

        @Override
        public int hashCode() {
            return Objects.hash(a, b);
        }
    }

    public static Integer solution(int m, int n, int[][] arr) {
        int answer = 0;
        Set<Friend> sets = new HashSet<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    sets.add(new Friend(arr[i][j],arr[i][k]));
                }
            }
        }

        for(Friend f : sets) {
            int a = f.a;
            int b = f.b;

            boolean flag = true;
            for(Friend ff : sets) {
                if(ff.a == b && ff.b == a) {
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

        System.out.println(solution(m,n,arr));
    }
}
