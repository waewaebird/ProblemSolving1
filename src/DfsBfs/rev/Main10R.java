package DfsBfs.rev;

import java.util.Scanner;

public class Main10R {
    //미로탐색
    static int arr[][] = new int[7][7];
    static int DI[] = {-1,0,0,1};
    static int DJ[] = {0,-1,1,0};
    static int ch[][] = new int[7][7];
    static int answer = 0;

    public static void DFS(int ni, int nj) {
        if(ni == 6 && nj == 6) {
            answer++;
        } else {
            for (int k = 0; k < 4; k++) {
                int tempi = ni + DI[k];
                int tempj = nj + DJ[k];

                if(tempi >= 0 && tempi < 7 && tempj >= 0 && tempj < 7){
                    if(arr[tempi][tempj] == 0 && ch[tempi][tempj] == 0) {
                        ch[tempi][tempj] = 1;
                        DFS(tempi, tempj);
                        ch[tempi][tempj] = 0;
                    }
                }
            }
        }

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        ch[0][0] = 1;
        DFS(0,0);

        System.out.println(answer);
    }
}
