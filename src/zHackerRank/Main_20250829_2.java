package zHackerRank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main_20250829_2 {
    // Pairs
    public static Integer solution(int n, int k, int[] arr) {
        int answer = 0;
        Set<Integer> sets = new HashSet<>();

        for (int i = 0; i < n; i++) {
            sets.add(arr[i]);
        }

        for(Integer x : sets) {
            if(sets.contains(x + k)) {
                answer++;
            }
        }

        /*Arrays.sort(arr);
        for (int i = n-1; i >= 0 ; i--) {
            for (int j = i-1; j >=0 ; j--) {
                if(arr[i] - arr[j] >= k) {
                    if(arr[i] - arr[j] == k) {
                        answer++;
                    }
                    break;
                }
            }
        }*/

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(solution(n,k,arr));
    }
}
