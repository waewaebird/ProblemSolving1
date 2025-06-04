package zHackerRank._202505;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_20250528_3 {
    // Ice Cream Parlor
    public static List<Integer> solution(int k, int n, int[] cost) {
        List<Integer> answers = new ArrayList<>();
        boolean flag = false;

        for (int i = 0; i < n; i++) {
            if(flag){
                break;
            }
            for (int j = i+1; j < n; j++) {
                if(cost[i] + cost[j] == k) {
                    answers.add(i+1);
                    answers.add(j+1);
                    flag = true;
                    break;
                }
            }
        }

        return answers;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        List<List<Integer>> answers = new ArrayList<>();

        for (int i = 0; i < t; i++) {
            int k = in.nextInt();
            int n = in.nextInt();

            int[] cost = new int[n];
            for (int j = 0; j < n; j++) {
                cost[j] = in.nextInt();
            }
            answers.add(solution(k,n,cost));
        }

        for(List<Integer> temp : answers) {
            System.out.println(temp.get(0) + " " + temp.get(1));
        }
    }
}
