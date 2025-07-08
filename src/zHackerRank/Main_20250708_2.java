package zHackerRank;

import java.util.*;

public class Main_20250708_2 {
    // Maximum Perimeter Triangle
    public static List<Integer> solution(int n, int[] arr) {
        List<Integer> answers = new ArrayList<>();

        Arrays.sort(arr);
        for (int i = n-1; i >= 0 ; i--) {
            if(answers.size() > 0) {
                break;
            }
            for (int j = i-1; j >= 1; j--) {
                if(arr[j] + arr[j-1] > arr[i]) {
                    answers.add(arr[i]);
                    answers.add(arr[j]);
                    answers.add(arr[j-1]);
                    break;
                } else {
                    break;
                }
            }
        }

        if(answers.size() < 3) {
            answers.add(-1);
        }

        Collections.sort(answers);

        return answers;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr= new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for(int x : solution(n,arr)) {
            System.out.print(x + " ");
        }
    }
}
