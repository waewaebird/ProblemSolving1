package DynamicProgramming;

import java.util.Scanner;

public class Main3 {
    public static int solution(int[] arr) {
        int answer = 0;
        int[] dy = new int[arr.length]; //arr i번째 숫자를 마지막 길이로 하는 배열
        dy[0] = 1;

        for (int i = 1; i < arr.length; i++) {
            int max = 0;

            for (int j = i-1; j >= 0 ; j--) {
                if(arr[j] < arr[i] && dy[j] > max) {
                    max = dy[j];
                }
            }
            dy[i] = max+1;
            answer = Math.max(answer, dy[i]);
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

        System.out.println(solution(arr));
    }
}



/*
1 1 2 3 2 1 4 2 4
1 1 2 3 2 1 4 2 4

3
1 2 3
답 : 3

8
5 3 7 8 6 2 9 4
답 : 4

9
2 7 5 8 6 4 7 12 3
답 : 5


9
2 7 5 8 6 4 12 3

* */