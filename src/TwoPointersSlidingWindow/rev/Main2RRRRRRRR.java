package TwoPointersSlidingWindow.rev;

import java.util.*;

public class Main2RRRRRRRR {
    // 공통원소 구하기
    public static Integer[] solution(int n, int[] arr1, int m, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int x : arr1) {
            map.put(x, map.getOrDefault(x,0) + 1);
        }
        for(int x : arr2) {
            map.put(x, map.getOrDefault(x,0) + 1);
        }
        List<Integer> list = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > 1) {
                list.add(entry.getKey());
            }
        }

        list.sort(null);

        return list.toArray(new Integer[0]);
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

        for(int a : solution(n,arr1,m,arr2)) {
            System.out.print(a + " ");
        }
    }
}
