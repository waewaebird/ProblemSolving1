package Array;
import java.util.Scanner;

public class Main7 {
    public static int solution2(int n, int[] arr) {
        int answer = 0;
        int cnt = 0;

        for(int i= 0 ; i<n ; i++) {
            if(arr[i] == 1) {
                cnt++;
                answer+=cnt;
            }
            else cnt = 0;
        }
        return answer;
    }

    public static int solution(int n, int[] arr) {
        int answers[] = new int[n];
        int answer = 0;
        for(int i = 0 ; i < n ; i++) {
            if(arr[i] == 0) {
                answers[i] = 0;
            } else {
                if(i == 0) {
                    answers[i] = 1;
                } else {
                    answers[i] = answers[i-1]+1;
                }
            }
            answer = answer + answers[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();
        int[] arr = new int[input1];
        for(int i = 0 ; i < input1 ; i++) {
            arr[i] = in.nextInt();
        }

        int answer = solution(input1, arr);
        System.out.println(answer);
    }
}