package zHackerRank._202506;

import java.util.*;

public class Main_20250630_2 {
    public static int[] solution(int n, int[] arr) {
        int p = arr[0];

        List<Integer> mins = new ArrayList<>();
        List<Integer> maxs = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if(arr[i] < p) {
                mins.add(arr[i]);
            }

            if(arr[i] > p) {
                maxs.add(arr[i]);
            }
        }

        Collections.sort(mins);
        for (int i = 0; i < mins.size(); i++) {
            arr[i] = mins.get(i);
        }
        arr[mins.size()] = p;
        Collections.sort(maxs);
        for (int i = 0; i < maxs.size(); i++) {
            arr[i+mins.size()+1] = maxs.get(i);
        }

        return arr;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for(Integer x : solution(n,arr)) {
            System.out.print(x + " ");
        }
    }
}
