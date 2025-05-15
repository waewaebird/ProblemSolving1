package zHackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main_20250515_5 {

    public static int solution(int n, int[] arr) {
        Map<Integer, Integer> maps = new HashMap<>();

        for (int i = 0; i < n; i++) {
            maps.put(arr[i], maps.getOrDefault(arr[i], 0) + 1);
        }

        int answer = Integer.MAX_VALUE;
        int sum = Integer.MIN_VALUE;

        for(Integer key : maps.keySet()) {
            if(maps.get(key) >= sum) {
                if(maps.get(key) > sum) {
                    answer = key;
                } else {
                    answer = Math.min(answer, key);
                }
                sum = maps.get(key);
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
