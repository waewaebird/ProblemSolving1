package zHackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main_20250714_2 {
    static int N;
    static int[] arr;
    static char[] op = {'*', '+', '-'};
    static boolean flag = false;
    static Map<String, Boolean> memo = new HashMap<>();

    public static void DFS(int v, int oriSum, String oriStr) {

        if(flag) {
            return;
        }

        if(oriSum > 100000) {
            return;
        }

        oriSum = ((oriSum % 101) + 101) % 101;
        String key = v + " , " + oriSum;
        if(memo.containsKey(key)) {
            return;
        }
        memo.put(key, true);

        if(v == N) {
            if(oriSum % 101 == 0) {
                System.out.println(oriStr);
                flag = true;
            }
        } else {
            for (int i = 0; i < 3; i++) {
                int sum = 0;
                String str = "";
                if(op[i] == '*') {
                    str = oriStr + "*" + arr[v];
                    sum = oriSum * arr[v];
                    DFS(v + 1, sum, str);
                } else if(op[i] == '+') {
                    str = oriStr + "+" + arr[v];
                    sum = oriSum + arr[v];
                    DFS(v + 1, sum, str);
                } else if(op[i] == '-') {
                    str = oriStr + "-" + arr[v];
                    sum = oriSum - arr[v];
                    DFS(v + 1, sum, str);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        DFS(1, arr[0], String.valueOf(arr[0]));
    }
}
