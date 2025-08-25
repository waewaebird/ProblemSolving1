package SortingAndSearching.rev;

import java.util.Scanner;

public class Main1RRRRRRR {
    // 선택 정렬
    public static int[] solution(int n, int[] arr) {
        // 선택정렬 : 각 회차에서 최소값을 선택해서 제자리에 보내는 정렬.(처음부터 끝까지 순회하면서 최솟값을 찾고, 그 최솟값을 가장 앞자리의 인덱스와 교환해나감.)

        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int index = 0;

            for (int j = i+1; j < n; j++) {
                if(arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
            }

            if(arr[i] > min) {
                int temp = arr[i];
                arr[i] = min;
                arr[index] = temp;
            }
        }

        return arr;
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
