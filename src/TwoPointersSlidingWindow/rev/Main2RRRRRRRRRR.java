package TwoPointersSlidingWindow.rev;

import java.util.*;

public class Main2RRRRRRRRRR {
    // 공통원소 구하기
    public static List<Integer> solution(int n, int[] arr, int m, int[] arr2) {
        List<Integer> answer = new ArrayList<>();

        Set<Integer> sets = new HashSet<>();

        for(int x : arr) {
            sets.add(x);
        }

        for(int x : arr2) {
            if(sets.contains(x)) {
                answer.add(x);
            }
            sets.add(x);
        }

        answer.sort(null);

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int m = in.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = in.nextInt();
        }

        for(Integer a : solution(n,arr,m,arr2)) {
            System.out.print(a + " ");
        }
    }
}
