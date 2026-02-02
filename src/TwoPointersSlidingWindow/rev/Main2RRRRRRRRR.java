package TwoPointersSlidingWindow.rev;

import java.util.*;

public class Main2RRRRRRRRR {
    // 공통원소 구하기
    public static List<Integer> solution(int a, int[] arr, int b, int[] brr) {
        Set<Integer> sets = new HashSet<>();
        for(int x : arr) {
            sets.add(x);
        }

        List<Integer> answers = new ArrayList<>();
        for(int x : brr) {
            if(sets.contains(x)) {
                answers.add(x);
            }
        }

        answers.sort(null);
        return answers;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = in.nextInt();
        }

        int b = in.nextInt();
        int[] brr = new int[b];
        for (int i = 0; i < b; i++) {
            brr[i] = in.nextInt();
        }

        for(int answer : solution(a,arr,b,brr)) {
            System.out.print(answer + " ");
        }
    }
}
