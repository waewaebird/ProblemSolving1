import java.util.*;

public class FroginMaze {
    static int[] DI = {-1,0,0,1};
    static int[] DJ = {0,-1,1,0};
    static int N;
    static int M;
    static int K;
    static char[][] arr;
    static int[][] ch;
    static int[][] tunnel;
    static int total = 0;
    static int exit = 0;
    static int die = 0;

    public static void DFS(int v1, int v2) {
        if(arr[v1][v2] == '*') {
            total++;
            die++;
            return;
        } else if(arr[v1][v2] == '%') {
            total++;
            exit++;
            return;
        } else if(arr[v1][v2] == 'O') {
            if(K > 0) {
                int tunIdx = tunnel[v1][v2];
                boolean isFind;
                if(tunIdx == 0) {
                    isFind = true;
                } else {
                    isFind = false;
                }

                for (int i = 0; i < N; i++) {
                    if(isFind) {
                        break;
                    }
                    for (int j = 0; j < M; j++) {
                        if(tunIdx != 0 && tunnel[i][j] == tunIdx) {
                            if(i != v1 || j != v2) {
                                v1 = i;
                                v2 = j;
                                isFind = true;
                                break;
                            }
                        }
                    }
                }
            }
        }

        int move = 0;
        int oCnt = 0;
        for (int i = 0; i < 4; i++) {
            int temp1 = v1 + DI[i];
            int temp2 = v2 + DJ[i];
            if(temp1 >= 0 && temp1 < N && temp2 >= 0 && temp2 < M) {
                if(ch[temp1][temp2] == 0 && arr[temp1][temp2] != '#') {
                    ch[temp1][temp2] = 1;
                    DFS(temp1, temp2);
                    move++;
                    ch[temp1][temp2] = 0;
                }

                if(arr[temp1][temp2] == 'O') {
                    oCnt++;
                }
            }
        }

        if(move == 0) {
            if(oCnt == 0) {
                System.out.println(v1 + " " + v2);
                total++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();
        K = in.nextInt();

        arr = new char[N][M];
        ch = new int[N][M];
        tunnel = new int[N][M];

        int s1 = 0;
        int s2 = 0;
        for (int i = 0; i < N; i++) {
            String strs = in.next();
            for (int j = 0; j < M; j++) {
                arr[i][j] = strs.charAt(j);

                if(arr[i][j] == 'A') {
                    s1 = i;
                    s2 = j;
                }
            }
        }

        for (int i = 1; i <= K; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            tunnel[a-1][b-1] = i;
            tunnel[c-1][d-1] = i;
        }

        ch[s1][s2] = 1;
        DFS(s1,s2);

        System.out.println(exit);
        System.out.println(total);
        System.out.println(die);

        if(exit == 0) {
            System.out.println("0.0000000000");
        } else {
            double answer = (double) exit / total;
            System.out.print(answer);
        }

    }
}
