package SortingAndSearching.rev;

import java.util.Arrays;
import java.util.Scanner;

public class Main6RRRRR {
    // 장난꾸러기
    public static int[] solution(int n, int[] arr) {
        int[] answer = new int[2];

        int[] temp = Arrays.copyOf(arr, arr.length);

        Arrays.sort(arr);
        int index = 0;
        for (int i = 0; i < n; i++) {
            if(temp[i] != arr[i]) {
                answer[index] = i+1;
                index++;
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
