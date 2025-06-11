package TwoPointersSlidingWindow.rev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main2RRR {
    // 공통원소 구하기
    public static List<Integer> solution(int n, int[] arr1, int m, int[] arr2) {
        List<Integer> answers = new ArrayList<>();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int lt1 = 0;
        int lt2 = 0;

        int max = Math.max(arr1.length, arr2.length);

        while(lt2 < max && lt1 < max) {
            if(arr1[lt1] > arr2[lt2]) {
                lt2++;
            } else if(arr1[lt1] < arr2[lt2]) {
                lt1++;
            } else {
                answers.add(arr1[lt1]);
                lt2++;
                lt1++;
            }
        }

        return answers;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = in.nextInt();
        }

        int m = in.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = in.nextInt();
        }

        for(int x : solution(n,arr1,m,arr2)) {
            System.out.print(x + " ");
        }
    }
}
