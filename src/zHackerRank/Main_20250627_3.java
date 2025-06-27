package zHackerRank;

import java.util.*;

public class Main_20250627_3 {
    // Weighted Uniform Strings
    public static List<String> solution(String str, int[] arr) {
        List<String> answers = new ArrayList<>();

        int[] a = new int[10000000];

        int cnt = 1;
        int now = 0;
        for (int i = 0; i < str.length(); i++) {
            if(i == 0) {
                now = (int)str.charAt(i) - 96;
                a[now] = 1;
            } else {
                if(str.charAt(i-1) != str.charAt(i)) {
                    now = (int)str.charAt(i) - 96;
                    a[now] = 1;
                    cnt = 1;
                } else{
                    cnt++;
                    now = ((int)str.charAt(i) - 96) * cnt;
                    a[now] = 1;
                }
            }
        }

        for(int x : arr) {
            if(a[x] == 1) {
                answers.add("Yes");
            } else {
                answers.add("No");
            }
        }

        return answers;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String str = in.next();
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        List<String> answers = solution(str,arr);

        for(String x : answers) {
            System.out.println(x);
        }
    }
}
