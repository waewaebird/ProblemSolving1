package Array.rev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main12R {
    //멘토링

    public static int solution(int m, int n, int[][] arr) {
        List<int[]> temp = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = j; k < n; k++) {
                    if(arr[i][j] != arr[i][k]) {
                        boolean flag = true;

                        for(int[] temps : temp) {
                            if(temps[0] == arr[i][j] && temps[1] == arr[i][k]) {
                                flag = false;
                                break;
                            }
                        }

                        if(flag) {
                            temp.add(new int[] {arr[i][j], arr[i][k]});
                        }
                    }
                }
            }
        }

        int answer = 0;

        for(int[] temp1 : temp) {
            boolean flag = true;
            for(int[] temp2 : temp) {
                if(temp1[0] == temp2[1] && temp1[1] == temp2[0]) {
                    flag = false;
                    break;
                }
            }

            if(flag) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(solution(m, n, arr));

    }
}
