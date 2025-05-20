package SortingAndSearching.rev;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main5RR {
    //중복 확인
    public static String solution(int n, int[] arr) {
        String answer = "U";

        Map<Integer, Integer> maps = new HashMap<>();

        for (int i = 0; i < n; i++) {
            maps.put(arr[i], maps.getOrDefault(arr[i], 0) + 1);

            if(maps.get(arr[i]) > 1) {
                break;
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
