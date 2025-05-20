package SortingAndSearching.rev;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main5RRR {
    // 중복 확인
    public static String solution(int n, int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        if(set.size() == n) {
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
