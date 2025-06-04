package zHackerRank._202505;

import java.util.*;

public class Main_20250530_3 {
    // Two Characters
    static String[] combi;
    static int x;
    static int N;
    static String s;
    static Set<String> set = new HashSet<>();
    static Object[] temp;
    static int answer = Integer.MIN_VALUE;

    public static void DFS(int v, int start) {
        if (v == x) {
            String testStr = s;
            for(String x : combi) {
                testStr = testStr.replaceAll(x, "");
            }

            boolean flag = true;
            for (int i = 0; i < testStr.length()-2; i++) {
                if(testStr.charAt(i) != testStr.charAt(i+2)) {
                    flag = false;
                }
            }

            if(flag) {
                answer = Math.max(answer, testStr.length());
            }

        } else {
            for (int i = start; i < temp.length; i++) {
                combi[v] = String.valueOf(temp[i]);
                DFS(v+1, i+1);
            }
        }
    }

    public static int solution(int N, String s) {
        int answer = 0;

        for(char x : s.toCharArray()) {
            set.add(String.valueOf(x));
        }

        x = set.size() - 2;

        if(x < 0){
            return 0;
        }

        combi = new String[x];

        temp = set.toArray();

        DFS(0, 0);

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        s = in.next();

        solution(N,s);

        if(answer == Integer.MIN_VALUE) {
            answer = 0;
        }

        System.out.println(answer);
    }
}
