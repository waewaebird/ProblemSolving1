package TwoPointersSlidingWindow.rev;

import java.util.*;

public class Main2RRRR {
    // 공통원소 구하기
    public static List<Integer> solution(int[] aa, int[] bb) {
        List<Integer> answers = new ArrayList<>();

        Map<Integer, Integer> maps = new HashMap<>();
        for(int x : aa) {
            maps.put(x, maps.getOrDefault(x, 0) + 1);
        }
        for(int x : bb) {
            maps.put(x, maps.getOrDefault(x, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> e : maps.entrySet()) {
            if (e.getValue() > 1) {
                answers.add(e.getKey());
            }
        }

        answers.sort(null);
        return answers;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int[] aa = new int[a];
        for (int i = 0; i < a; i++) {
            aa[i] = in.nextInt();
        }

        int b = in.nextInt();
        int[] bb = new int[b];
        for (int i = 0; i < b; i++) {
            bb[i] = in.nextInt();
        }

        for(int x : solution(aa,bb)) {
            System.out.print(x + " ");
        }
    }
}
