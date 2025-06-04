package zHackerRank._202505;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main_20250521_3 {
    // Equalize the Array
    public static int solution(int n, int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        int temp = Integer.MIN_VALUE;
        int k = 0;
        for(Integer key : map.keySet()) {
            if(map.get(key) > temp) {
                temp = map.get(key);
                k = key;
            }
        }

        int answer = 0;
        for(Integer key : map.keySet()) {
            if(key != k) {
                answer += map.get(key);
            }
        }

        return answer;
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
