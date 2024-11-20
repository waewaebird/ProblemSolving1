package Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main8 {
    public static int[] solution2(int n, int[] arr) {
        int[] answer = new int[n];
        for(int i = 0 ; i < n ; i++) {
            int cnt = 1;
            for(int j = 0 ; j<n ;j++){
                if(arr[j] > arr[i]) {
                    cnt++;
                }
                answer[i] = cnt;
            }
        }
        return answer;
    }

    public static List<Integer> solution(int n, int[] arr) {
        List<Integer> answers = new ArrayList<>();
        for(int i = 0 ; i < n ; i++) {
            int cnt = 1;

            for(int j = 0 ; j < n ; j++) {
                if(i == j) {
                    continue;
                } else {
                    if(arr[i] < arr[j]) {
                        cnt++;
                    }
                }
            }
            answers.add(cnt);
        }
        return answers;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();
        int[] arr = new int[input1];
        for(int i = 0 ; i < input1 ; i++) {
            arr[i] = in.nextInt();
        }
        for(int nn : solution(input1, arr)) {
            System.out.print(nn + " ");
        }
    }
}