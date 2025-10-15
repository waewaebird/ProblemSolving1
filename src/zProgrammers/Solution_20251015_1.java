package zProgrammers;

import java.util.Arrays;

class Solution_20251015_1 {
    static int[] unf;

    public static int find(int v) {
        if(v == unf[v]) {
            return v;
        } else{
            return unf[v] = find(unf[v]);
        }
    }

    public static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);

        if(fa != fb) {
            unf[fa] = fb;
        }
    }

    public int solution(int n, int[][] computers) {
        int answer = n;

        unf = new int[n];
        for (int i = 0; i < n; i++) {
            unf[i] = i;
        }

        for (int i = 0; i < n; i++) {
            int me = i;
            for (int j = 0; j < n; j++) {
                if(i != j) {
                    if(computers[i][j] == 1) {
                        if(find(me) != find(j)) {
                            union(me,j);
                            answer--;
                        }
                    }
                }
            }
        }

        System.out.println(Arrays.toString(unf) + " " + answer);

        return answer;
    }

    public static void main(String[] args) {
        Solution_20251015_1 s = new Solution_20251015_1();
        s.solution(3, new int[][] {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}});
        s.solution(3, new int[][] {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}});
    }
}