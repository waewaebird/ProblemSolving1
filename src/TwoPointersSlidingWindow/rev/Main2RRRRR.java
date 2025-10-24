package TwoPointersSlidingWindow.rev;

import java.util.*;

public class Main2RRRRR {
    // 공통원소 구하기
    public static List<Integer> solution(int n, int[] arr1, int m, int[] arr2) {
        List<Integer> answers = new ArrayList<>();
        Map<Integer, Integer> maps = new HashMap<>();
        for(int x : arr1) {
            maps.put(x, maps.getOrDefault(x , 0) + 1);
        }
        for(int x : arr2) {
            maps.put(x, maps.getOrDefault(x , 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : maps.entrySet()) {
            if(entry.getValue() > 1) {
                answers.add(entry.getKey());
            }
        }
        answers.sort(null);
        return answers;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = in.nextInt();
        }

        int m = in.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = in.nextInt();
        }

        for(int x : solution(n,arr1,m,arr2)) {
            System.out.print(x + " ");
        }
    }
}
