package SortingAndSearching.rev;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main5RRRRRRRRRR {
    // 중복 확인
    public static String solution(int n, int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int x : arr) {
            set.add(x);
        }

        if(set.size() != n) {
            return "D";
        } else {
            return "U";
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
