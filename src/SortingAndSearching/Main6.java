package SortingAndSearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main6 {
    public static List<Integer> solution2(int n, int[] arr) {
        List<Integer> answer = new ArrayList<>();

        //얇은 복사 vs 깊은 복사
        int[] tmp = arr.clone();
        Arrays.sort(tmp);

        for (int i = 0; i < n; i++) {
            if(arr[i] != tmp[i]) {
                answer.add(i+1);
            }
        }

        return answer;
    }


    public static int[] solution(int n, int[] arr) {
        int[] answers = new int[2];
        int temp = 0;

        for(int i = n-1; i >= 0 ; i--) {
            if(arr[i] < arr[i-1]) {
                answers[1] = i+1;
                temp = arr[i];
                break;
            }
        }

        for (int i = 0; i < answers[1]; i++) {
            if(arr[i] > temp){
                answers[0] = i+1;
                break;
            }
        }
        return answers;
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
