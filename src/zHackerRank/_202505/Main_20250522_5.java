package zHackerRank._202505;

import java.util.*;

public class Main_20250522_5 {
    // Non-Divisible Subset
    public static int solution(int n, int k, int[] arr) {
        Map<Integer, Integer> maps = new HashMap<>();
        for (int i = 0; i < n; i++) {
            maps.put(arr[i] % k , maps.getOrDefault(arr[i] % k , 0)+ 1);
        }

        int answer = 0;

        if(maps.containsKey(0)) {
            answer += 1;
        }

        if(k%2 == 0 && maps.containsKey(k / 2)) {
            answer += 1;
        }

        for(int i = 1; i <= k/2 ; i++) {
            if(i == k - i){
                continue;
            }
            int a = maps.getOrDefault(i,0);
            int b = maps.getOrDefault(k -i, 0);
            answer += Math.max(a,b);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        int k = in.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(n,k,arr));
    }
}
