package Array.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3RRRRR {
    // 가위 바위 보
    public static List<String> solution(int n, int[] arr1, int[] arr2) {
        List<String> answers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if(arr1[i] == 1 && arr2[i] == 3) {
                answers.add("A");
            } else if(arr1[i] == 2 && arr2[i] == 1) {
                answers.add("A");
            } else if(arr1[i] == 3 && arr2[i] == 2) {
                answers.add("A");
            } else if(arr1[i] == arr2[i]) {
                answers.add("D");
            } else {
                answers.add("B");
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

        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = in.nextInt();
        }

        for(String x : solution(n,arr1,arr2)) {
            System.out.println(x);
        }
    }
}
