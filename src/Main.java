import java.util.Scanner;

public class Main {
    static int[] Nm1 = {-2, -2, -1, -1,2,2,1,1};
    static int[] Nm2 = {-1,1,-2,2,1,1,-2,2};

    static int[] Bm1_1 = {-1,-2,-3};
    static int[] Bm1_2 = {-1,-2,-3};

    static int[] Bm2_1 = {-1,-2,-3};
    static int[] Bm2_2 = {1,2,3};

    static int[] Bm3_1 = {1,2,3};
    static int[] Bm3_2 = {-1,2,-3};

    static int[] Bm4_1 = {1,2,3};
    static int[] Bm4_2 = {1,2,3};

    static int[] Rm1_1 = {-1,-2,-3};
    static int[] Rm1_2 = {0,0,0};

    static int[] Rm2_1 = {0,0,0};
    static int[] Rm2_2 = {-1,-2,-3};

    static int[] Rm3_1 = {0,0,0};
    static int[] Rm3_2 = {1,2,3};

    static int[] Rm4_1 = {1,2,3};
    static int[] Rm4_2 = {0,0,0};
    static int move;
    static String answer = "NO";

    public static void solution(int V, String nowHorse, String nowIndex, int I, int J, int[] moving1, int[] moving2, String[][] board) {
        if(answer.equals("YES")) {
            return;
        }

        for (int k = 0; k < 3; k++) {
            int ni = I + moving1[k];
            int nj = J + moving2[k];

            if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                if(board[ni][nj].equals("BQ")) {
                    answer = "YES";
                    break;
                } else {
                    if(!board[ni][nj].equals("")) {
                        break;
                    } else {
                        board[I][J] = "";
                        board[ni][nj] = nowHorse + " " + nowIndex;

                        DFS(V+1, board);

                        board[I][J] = nowHorse + " " + nowIndex;
                        board[ni][nj] = "";

                        DFS(V+1, board);
                    }
                }
            }
        }


    }

    public static void DFS(int v, String[][] board) {
        if(answer.equals("YES")) {
            return;
        }

        if(v > move) {
            return;
        } else {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if(!board[i][j].equals("") && !board[i][j].equals("BQ")) {
                        String nowHorse = board[i][j].split(" ")[0];
                        String nowIndex = board[i][j].split(" ")[1];

                        if(nowHorse.equals("Q")) {
                            solution(v, nowHorse, nowIndex, i, j, Bm1_1, Bm1_2, board);

                            solution(v, nowHorse, nowIndex, i, j, Bm2_1, Bm2_2, board);

                            solution(v, nowHorse, nowIndex, i, j, Bm3_1, Bm3_2, board);

                            solution(v, nowHorse, nowIndex, i, j, Bm4_1, Bm4_2, board);

                            solution(v, nowHorse, nowIndex, i, j, Rm1_1, Rm1_2,board);

                            solution(v, nowHorse, nowIndex, i, j, Rm2_1, Rm2_2,board);

                            solution(v, nowHorse, nowIndex, i, j, Rm3_1, Rm3_2,board);

                            solution(v, nowHorse, nowIndex, i, j, Rm4_1, Rm4_2,board);

                        } else if(nowHorse.split(" ")[0].equals("N")) {
                            for (int k = 0; k < 8; k++) {
                                int ni = i + Nm1[k];
                                int nj = j + Nm2[k];

                                if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                                    if(board[ni][nj].equals("BQ")) {
                                        answer = "YES";
                                        break;
                                    } else {
                                        if(!board[ni][nj].equals("")) {
                                            break;
                                        } else {
                                            board[i][j] = "";
                                            board[ni][nj] = nowHorse + " " + nowIndex;

                                            DFS(v+1, board);

                                            board[i][j] = nowHorse + " " + nowIndex;
                                            board[ni][nj] = "";

                                            DFS(v+1, board);
                                        }
                                    }
                                }
                            }
                        } else if(nowHorse.split(" ")[0].equals("B")) {
                            solution(v, nowHorse, nowIndex, i, j, Bm1_1, Bm1_2, board);

                            solution(v, nowHorse, nowIndex, i, j, Bm2_1, Bm2_2, board);

                            solution(v, nowHorse, nowIndex, i, j, Bm3_1, Bm3_2, board);

                            solution(v, nowHorse, nowIndex, i, j, Bm4_1, Bm4_2, board);
                        } else {
                            solution(v, nowHorse, nowIndex, i, j, Rm1_1, Rm1_2, board);

                            solution(v, nowHorse, nowIndex, i, j, Rm2_1, Rm2_2, board);

                            solution(v, nowHorse, nowIndex, i, j, Rm3_1, Rm3_2, board);

                            solution(v, nowHorse, nowIndex, i, j, Rm4_1, Rm4_2, board);
                        }
                    }
                }
                if(answer.equals("YES")) {
                    break;
                }
            }

        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int g = in.nextInt();

        for (int i = 0; i < g; i++) {
            String[][] board = new String[4][4];

            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    board[j][k] = "";
                }
            }

            int w = in.nextInt();
            int b = in.nextInt();
            move = in.nextInt();

            for (int j = 0; j < w; j++) {
                String str = in.next();
                String J = in.next();
                Integer I = in.nextInt();

                int tempi, tempj;
                if(J.equals("A")) {
                    tempj = 0;
                } else if(J.equals("B")) {
                    tempj = 1;
                } else if(J.equals("C")) {
                    tempj = 2;
                } else {
                    tempj = 3;
                }

                tempi = Math.abs(I - 4);
                board[tempi][tempj] = str + " " + j;
            }

            for (int j = 0; j < b; j++) {
                String str = in.next();
                String J = in.next();
                Integer I = in.nextInt();

                int tempi, tempj;
                if(J.equals("A")) {
                    tempj = 0;
                } else if(J.equals("B")) {
                    tempj = 1;
                } else if(J.equals("C")) {
                    tempj = 2;
                } else {
                    tempj = 3;
                }

                tempi = Math.abs(I - 4);

                board[tempi][tempj] = "B" + str;
            }

            DFS(0, board);
            System.out.println(answer);
        }

    }
}
