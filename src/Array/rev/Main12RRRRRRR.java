package Array.rev;

import java.util.*;

public class Main12RRRRRRR {
    // 멘토링
    public static int solution(int n, int m, int[][] arr) {
        int answer = 0;

        Set<String> sets = new HashSet<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    sets.add(arr[i][j] + " " + arr[i][k]);
                }
            }
        }

        List<String> answers = new ArrayList<>();
        for(String x : sets) {
            boolean flag = true;
            for(String xx : sets) {
                if(x.split(" ")[0].equals(xx.split(" ")[1]) && x.split(" ")[1].equals(xx.split(" ")[0])) {
                    flag = false;
                }
            }

            if(flag) {
                answers.add(x);
            }
        }

        return answers.size();
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
