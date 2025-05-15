package zHackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main_20250515_2 {
    // Sales by Match

    public static int solution(int n, int[] arr){
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for(int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for(Integer key : map.keySet()) {
            answer += (map.get(key) / 2);
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
