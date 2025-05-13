package zHackerRank;

import java.util.Scanner;

public class Main_20250513_2 {
    public static int solution(int n, String s) {
        int[] arr = new int[n+1];

        int answer = 0;
        int level = 0;
        for (int i = 1; i <= n; i++) {
            if(s.charAt(i-1) == 'U') {
                level++;
            } else if(s.charAt(i-1) == 'D') {
                level--;
            }
            arr[i] = level;
        }

        for (int i = 0; i <= n; i++) {

            //System.out.print(arr[i] + " ");

            if(i != 0) {
                if(arr[i] == 0 && arr[i-1] < 0) {
                    answer++;
                }
            }
        }
        
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String s = in.next();

        System.out.println(solution(n,s));
    }
}
