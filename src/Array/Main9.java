package Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main9 {
    public static int solution2(int n, int[][] arr) {
        int answer = Integer.MAX_VALUE;
        int sum1, sum2; //행 , 열

        for(int i = 0 ; i<n ; i++) {
            sum1=sum2 =0;
            for(int j = 0; j <n ; j++) {
                sum1+=arr[i][j];
                sum2+=arr[j][i];
            }
            answer=Math.max(answer,sum1);
            answer=Math.max(answer,sum2);
        }

        sum1=sum2=0;
        for(int i=0 ; i<n; i++) {
            sum1+=arr[i][i];
            sum2+=arr[i][n-1-i];
        }
        answer=Math.max(answer,sum1);
        answer=Math.max(answer,sum2);

        return answer;
    }




    public static int solution(int n, int[][] arr) {
        int answer = 0;
        List<Integer> answers = new ArrayList<>();

        int sum2 = 0;
        int sum4 = 0;
        for(int i = 0 ; i < n ; i++) {
            int sum3 = 0;
            int sum = 0;

            for(int j = 0 ; j < n ; j++) {
                if(i==j) {
                    sum2 = sum2=arr[i][j];
                }
                sum = sum+arr[i][j];
                sum3 = sum3+arr[j][i];
            }
            sum4 = sum4 + arr[i][n-1-i];
            answers.add(sum);
            answers.add(sum3);
        }
        answers.add(sum2);


        for(int sss : answers) {
            if(sss > answer) {
                answer = sss;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();

        int[][] arr = new int[input1][input1];

        for (int i = 0; i < input1; i++) {
            for (int j = 0; j < input1; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(solution(input1, arr));
    }
}