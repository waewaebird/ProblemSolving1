package SortingAndSearching.rev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main6RRR {
    // 장난꾸러기
    public static List<Integer> solution(int n, int[] arr) {
        List<Integer> answers = new ArrayList<>();

        int[] coffee = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if(arr[i] != coffee[i]) {
                answers.add(i+1);
            }
        }

        return answers;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for(int x : solution(n,arr)) {
            System.out.print(x + " ");
        }
    }
}
