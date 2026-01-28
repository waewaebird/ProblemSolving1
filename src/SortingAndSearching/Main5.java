package SortingAndSearching;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main5 {
    public static String solution2(int n, int[] arr) {
        String answer = "U";
        Arrays.sort(arr);

        for (int i = 0; i < n-1; i++) {
            if(arr[i] == arr[i+1]) {
                return "D";
            }
        }

        return answer;
    }

    public static String solution(int n, int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            if(map.get(arr[i]) > 1){
                return "D";
            }
        }

        return "U";
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
