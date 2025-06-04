package zHackerRank;

import java.util.*;

public class Main_20250604_2 {
    // Missing Numbers
    public static List<Integer> solution(int n, int m, int[] arr, int[] brr) {
        List<Integer> answers = new ArrayList<>();

        Map<Integer, Integer> atemp = new HashMap<>();
        Map<Integer, Integer> btemp = new HashMap<>();

        for(int x : arr) {
            atemp.put(x, atemp.getOrDefault(x, 0) + 1);
        }

        for(int x : brr) {
            btemp.put(x, btemp.getOrDefault(x, 0) + 1);
        }

        for(Integer key : btemp.keySet()) {
            if(!Objects.equals(atemp.get(key),btemp.get(key))) {
                answers.add(key);
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

        int m = in.nextInt();
        int[] brr = new int[m];
        for (int i = 0; i < m; i++) {
            brr[i] = in.nextInt();
        }

        for(int x : solution(n,m,arr,brr)) {
            System.out.print(x + " ");
        }
    }
}
