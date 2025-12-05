package TwoPointersSlidingWindow.rev;

import java.util.*;

public class Main2RRRRRR {
    // 공통원소 구하기
    public static List<Integer> solution(int n, int[] arr, int m, int[] arr2){
        List<Integer> answers = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();
        for(int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for(int x : arr2) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
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
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int m = in.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = in.nextInt();
        }

        for(int a : solution(n,arr,m,arr2)) {
            System.out.print(a + " ");
        }
    }
}
