package Array.rev;

import java.util.Scanner;

public class Main8RR {
    public static int[] solution(int n, int[] arr) {
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if(i == j) {
                    continue;
                }
                if(arr[i] < arr[j]) {
                    cnt++;
                }
            }
            answer[i] = cnt;
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

        for(int answer : solution(n,arr)) {
            System.out.print(answer + " ");
        }
    }
}
