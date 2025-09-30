package SortingAndSearching.rev;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main5RRRRRRR {
    // 중복 확인
    public static String solution(int n, int[] arr) {
        Set<Integer> sets = new HashSet<>();
        for(int x : arr) {
            sets.add(x);
        }

        if(sets.size() == arr.length) {
            return "U";
        } else {
            return "D";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(n,arr));
    }
}
