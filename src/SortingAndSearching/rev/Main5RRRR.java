package SortingAndSearching.rev;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main5RRRR {
    // 중복 확인
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(in.nextInt());
        }

        if(set.size() == n) {
            System.out.println("U");
        } else {
            System.out.println("D");
        }
    }
}
