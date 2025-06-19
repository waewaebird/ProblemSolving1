import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArithmeticExpressions {
    static int N;
    static int[] arr;
    static char[] op = {'*', '+', '-'};
    static Map<String, Integer> memo = new HashMap<>();
    static boolean flag = false;

    public static void DFS(int v, int oriSum, String oriStr) {
        /*if(memo.get(oriStr) != null) {
            return;
        }
        memo.put(oriStr, oriSum);*/


        if(flag) {
            return;
        }

        if(oriSum > 100000) {
            return;
        }

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
