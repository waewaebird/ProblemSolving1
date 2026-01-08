package TwoPointersSlidingWindow.rev;

import java.util.*;

public class Main2RRRRRRR {
    // 공통원소 구하기
    public static List<Integer> solution(int n1, int[] arr1, int n2, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int x : arr1) {
            map.put(x, map.getOrDefault(x,0) + 1);
        }

        for(int x : arr2) {
            map.put(x, map.getOrDefault(x,0) + 1);
        }

        List<Integer> answers = new ArrayList<>();
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
        int n1 = in.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = in.nextInt();
        }

        int n2 = in.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = in.nextInt();
        }


        for(int x : solution(n1,arr1,n2,arr2)) {
            System.out.print(x + " ");
        }

    }
}
