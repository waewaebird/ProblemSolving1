package Array.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1RRRRRRRRRR {
    // 큰 수 출력하기
    public static List<Integer> solution(int n, int[] arr) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if(i == 0) {
                answer.add(arr[i]);
            } else {
                if(arr[i] > arr[i-1]) {
                    answer.add(arr[i]);
                }
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

        for(int x : solution(n,arr)) {
            System.out.print(x + " ");
        }
    }
}
