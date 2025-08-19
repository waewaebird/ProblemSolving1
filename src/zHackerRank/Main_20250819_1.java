package zHackerRank;

import java.util.Scanner;

public class Main_20250819_1 {
    // 3D Surface Area
    public static Integer solution(int h, int w, int[][] arr) {
        int front = 0;
        int back = 0;
        int left = 0;
        int right = 0;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                // front
                if(j == 0) {
                    front += arr[i][j];
                } else if (j > 0) {
                    if(arr[i][j] >= arr[i][j-1]) {
                        front += arr[i][j] - arr[i][j-1];
                    }
                }

                // back
                if(j == w-1) {
                    back += arr[i][j];
                } else if(j < w-1) {
                    if(arr[i][j] >= arr[i][j+1]) {
                        back += arr[i][j] - arr[i][j+1];
                    }
                }

                // left
                if(i == 0) {
                    left += arr[i][j];
                } else if (i > 0) {
                    if(arr[i][j] >= arr[i-1][j]) {
                        left += arr[i][j] - arr[i-1][j];
                    }
                }

                // right
                if(i == h-1) {
                    right += arr[i][j];
                } else if(i < h-1) {
                    if(arr[i][j] >= arr[i+1][j]) {
                        right += arr[i][j] - arr[i+1][j];
                    }
                }

            }
        }
        // up
        int up = (1 * (h*w));

        // down
        int down = (1 * (h*w));

        /*System.out.println("front " + front);
        System.out.println("back " + back);
        System.out.println("up " + up);
        System.out.println("down " + down);
        System.out.println("left " + left);
        System.out.println("right " + right);*/

        return front + back + up + down + left + right;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int h = in.nextInt();
        int w = in.nextInt();

        int[][] arr = new int[h][w];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(solution(h,w,arr));
    }
}
