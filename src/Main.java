import java.util.Arrays;
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
                String[] tempArr = board[ni][nj].split(" ");
                if(tempArr[0].equals("q")) {
                    answer = "YES";
                    break;
                } else {
                    if(!board[ni][nj].equals("")) {
                        break;
                    } else {
                        board[I][J] = "";
                        board[ni][nj] = nowHorse + " " + nowIndex;

                        DFS(V+1, board, "b");

                        board[I][J] = nowHorse + " " + nowIndex;
                        board[ni][nj] = "";

                        //DFS(V+1, board, "b");
                    }
                }
            }
        }


    }

    public static void DFS(int v, String[][] board, String color) {
        if(answer.equals("YES")) {
            return;
        }

        if(v > move) {
            return;
        } else {
            if(color.equals("w")) {
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        if(!board[i][j].equals("") && !Character.isLowerCase(board[i][j].split(" ")[0].charAt(0))) {

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

                                        String[] tempArr = board[ni][nj].split(" ");
                                        if(tempArr[0].equals("q")) {
                                            answer = "YES";
                                            break;
                                        } else {
                                            if(!board[ni][nj].equals("")) {
                                                break;
                                            } else {
                                                board[i][j] = "";
                                                board[ni][nj] = nowHorse + " " + nowIndex;

                                                DFS(v+1, board, "b");

                                                board[i][j] = nowHorse + " " + nowIndex;
                                                board[ni][nj] = "";

                                                //DFS(v+1, board, "b");
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
            } else {
                String[][] sim = new String[board.length][board[0].length];

                int bi = 0;
                int bj = 0;

                for (int i = 0; i < board.length; i++) {
                    for (int j = 0; j < board[i].length; j++) {
                        sim[i][j] = board[i][j];

                        if(sim[i][j].equals("BQ")) {
                            bi = i;
                            bj = j;
                        }
                    }
                }

                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        if(!sim[i][j].equals("") && !sim[i][j].equals("-") && !sim[i][j].equals("BQ")) {

                            System.out.println(sim[i][j]);

                            String nowHorse = sim[i][j].split(" ")[0];
                            String nowIndex = sim[i][j].split(" ")[1];

                            if(nowHorse.equals("Q")) {
                                for (int k = 0; k < 3; k++) {
                                    int ni = i + Bm1_1[k];
                                    int nj = j + Bm1_2[k];

                                    if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                                        if(!sim[ni][nj].equals("BQ")) {
                                            if(!sim[ni][nj].equals("")) {
                                                break;
                                            } else {
                                                sim[ni][nj] = "-";
                                            }
                                        }
                                    }
                                }

                                for (int k = 0; k < 3; k++) {
                                    int ni = i + Bm2_1[k];
                                    int nj = j + Bm2_2[k];

                                    if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                                        if(!sim[ni][nj].equals("BQ")) {
                                            if(!sim[ni][nj].equals("")) {
                                                break;
                                            } else {
                                                sim[ni][nj] = "-";
                                            }
                                        }
                                    }
                                }

                                for (int k = 0; k < 3; k++) {
                                    int ni = i + Bm3_1[k];
                                    int nj = j + Bm3_2[k];

                                    if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                                        if(!sim[ni][nj].equals("BQ")) {
                                            if(!sim[ni][nj].equals("")) {
                                                break;
                                            } else {
                                                sim[ni][nj] = "-";
                                            }
                                        }
                                    }
                                }

                                for (int k = 0; k < 3; k++) {
                                    int ni = i + Bm4_1[k];
                                    int nj = j + Bm4_2[k];

                                    if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                                        if(!sim[ni][nj].equals("BQ")) {
                                            if(!sim[ni][nj].equals("")) {
                                                break;
                                            } else {
                                                sim[ni][nj] = "-";
                                            }
                                        }
                                    }
                                }

                                for (int k = 0; k < 3; k++) {
                                    int ni = i + Rm1_1[k];
                                    int nj = j + Rm1_2[k];

                                    if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                                        if(!sim[ni][nj].equals("BQ")) {
                                            if(!sim[ni][nj].equals("")) {
                                                break;
                                            } else {
                                                sim[ni][nj] = "-";
                                            }
                                        }
                                    }
                                }

                                for (int k = 0; k < 3; k++) {
                                    int ni = i + Rm2_1[k];
                                    int nj = j + Rm2_2[k];

                                    if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                                        if(!sim[ni][nj].equals("BQ")) {
                                            if(!sim[ni][nj].equals("")) {
                                                break;
                                            } else {
                                                sim[ni][nj] = "-";
                                            }
                                        }
                                    }
                                }

                                for (int k = 0; k < 3; k++) {
                                    int ni = i + Rm3_1[k];
                                    int nj = j + Rm3_2[k];

                                    if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                                        if(!sim[ni][nj].equals("BQ")) {
                                            if(!sim[ni][nj].equals("")) {
                                                break;
                                            } else {
                                                sim[ni][nj] = "-";
                                            }
                                        }
                                    }
                                }

                                for (int k = 0; k < 3; k++) {
                                    int ni = i + Rm4_1[k];
                                    int nj = j + Rm4_2[k];

                                    if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                                        if(!sim[ni][nj].equals("BQ")) {
                                            if(!sim[ni][nj].equals("")) {
                                                break;
                                            } else {
                                                sim[ni][nj] = "-";
                                            }
                                        }
                                    }
                                }
                            } else if(nowHorse.split(" ")[0].equals("N")) {
                                for (int k = 0; k < 8; k++) {
                                    int ni = i + Nm1[k];
                                    int nj = j + Nm2[k];

                                    if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                                        if(!sim[ni][nj].equals("BQ")) {
                                            if(!sim[ni][nj].equals("")) {
                                                break;
                                            } else {
                                                sim[ni][nj] = "-";
                                            }
                                        }
                                    }
                                }
                            } else if(nowHorse.split(" ")[0].equals("B")) {
                                for (int k = 0; k < 3; k++) {
                                    int ni = i + Bm1_1[k];
                                    int nj = j + Bm1_2[k];

                                    if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                                        if(!sim[ni][nj].equals("BQ")) {
                                            if(!sim[ni][nj].equals("")) {
                                                break;
                                            } else {
                                                sim[ni][nj] = "-";
                                            }
                                        }
                                    }
                                }

                                for (int k = 0; k < 3; k++) {
                                    int ni = i + Bm2_1[k];
                                    int nj = j + Bm2_2[k];

                                    if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                                        if(!sim[ni][nj].equals("BQ")) {
                                            if(!sim[ni][nj].equals("")) {
                                                break;
                                            } else {
                                                sim[ni][nj] = "-";
                                            }
                                        }
                                    }
                                }

                                for (int k = 0; k < 3; k++) {
                                    int ni = i + Bm3_1[k];
                                    int nj = j + Bm3_2[k];

                                    if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                                        if(!sim[ni][nj].equals("BQ")) {
                                            if(!sim[ni][nj].equals("")) {
                                                break;
                                            } else {
                                                sim[ni][nj] = "-";
                                            }
                                        }
                                    }
                                }

                                for (int k = 0; k < 3; k++) {
                                    int ni = i + Bm4_1[k];
                                    int nj = j + Bm4_2[k];

                                    if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                                        if(!sim[ni][nj].equals("BQ")) {
                                            if(!sim[ni][nj].equals("")) {
                                                break;
                                            } else {
                                                sim[ni][nj] = "-";
                                            }
                                        }
                                    }
                                }
                            } else {
                                for (int k = 0; k < 3; k++) {
                                    int ni = i + Rm1_1[k];
                                    int nj = j + Rm1_2[k];

                                    if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                                        if(!sim[ni][nj].equals("BQ")) {
                                            if(!sim[ni][nj].equals("")) {
                                                break;
                                            } else {
                                                sim[ni][nj] = "-";
                                            }
                                        }
                                    }
                                }

                                for (int k = 0; k < 3; k++) {
                                    int ni = i + Rm2_1[k];
                                    int nj = j + Rm2_2[k];

                                    if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                                        if(!sim[ni][nj].equals("BQ")) {
                                            if(!sim[ni][nj].equals("")) {
                                                break;
                                            } else {
                                                sim[ni][nj] = "-";
                                            }
                                        }
                                    }
                                }

                                for (int k = 0; k < 3; k++) {
                                    int ni = i + Rm3_1[k];
                                    int nj = j + Rm3_2[k];

                                    if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                                        if(!sim[ni][nj].equals("BQ")) {
                                            if(!sim[ni][nj].equals("")) {
                                                break;
                                            } else {
                                                sim[ni][nj] = "-";
                                            }
                                        }
                                    }
                                }

                                for (int k = 0; k < 3; k++) {
                                    int ni = i + Rm4_1[k];
                                    int nj = j + Rm4_2[k];

                                    if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                                        if(!sim[ni][nj].equals("BQ")) {
                                            if(!sim[ni][nj].equals("")) {
                                                break;
                                            } else {
                                                sim[ni][nj] = "-";
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }


                for (int y = 0; y < 4; y++) {
                    for (int u = 0; u < 4; u++) {
                        String temp = sim[y][u];
                        if(sim[y][u].equals("")) {
                            temp = "X";
                        }

                        System.out.print(temp + " ");
                    }
                    System.out.println();
                }

                System.out.println();
                System.out.println();
                System.out.println();

                for (int k = 0; k < 3; k++) {
                    int ni = bi + Bm1_1[k];
                    int nj = bj + Bm1_2[k];

                    if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                        if(sim[ni][nj].equals("")) {
                            board[bi][bj] = "";
                            board[ni][nj] = "BQ";

                            DFS(v+1, board, "w");

                            board[bi][bj] = "BQ";
                            board[ni][nj] = "";
                        }
                    }
                }

                for (int k = 0; k < 3; k++) {
                    int ni = bi + Bm2_1[k];
                    int nj = bj + Bm2_2[k];

                    if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                        if(sim[ni][nj].equals("")) {
                            board[bi][bj] = "";
                            board[ni][nj] = "BQ";

                            DFS(v+1, board, "w");

                            board[bi][bj] = "BQ";
                            board[ni][nj] = "";
                        }
                    }
                }

                for (int k = 0; k < 3; k++) {
                    int ni = bi + Bm3_1[k];
                    int nj = bj + Bm3_2[k];

                    if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                        if(sim[ni][nj].equals("")) {
                            board[bi][bj] = "";
                            board[ni][nj] = "BQ";

                            DFS(v+1, board, "w");

                            board[bi][bj] = "BQ";
                            board[ni][nj] = "";
                        }
                    }
                }

                for (int k = 0; k < 3; k++) {
                    int ni = bi + Bm4_1[k];
                    int nj = bj + Bm4_2[k];

                    if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                        if(sim[ni][nj].equals("")) {
                            board[bi][bj] = "";
                            board[ni][nj] = "BQ";

                            DFS(v+1, board, "w");

                            board[bi][bj] = "BQ";
                            board[ni][nj] = "";
                        }
                    }
                }

                for (int k = 0; k < 3; k++) {
                    int ni = bi + Rm1_1[k];
                    int nj = bj + Rm1_2[k];

                    if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                        if(sim[ni][nj].equals("")) {
                            board[bi][bj] = "";
                            board[ni][nj] = "BQ";

                            DFS(v+1, board, "w");

                            board[bi][bj] = "BQ";
                            board[ni][nj] = "";
                        }
                    }
                }

                for (int k = 0; k < 3; k++) {
                    int ni = bi + Rm2_1[k];
                    int nj = bj + Rm2_2[k];

                    if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                        if(sim[ni][nj].equals("")) {
                            board[bi][bj] = "";
                            board[ni][nj] = "BQ";

                            DFS(v+1, board, "w");

                            board[bi][bj] = "BQ";
                            board[ni][nj] = "";
                        }
                    }
                }

                for (int k = 0; k < 3; k++) {
                    int ni = bi + Rm3_1[k];
                    int nj = bj + Rm3_2[k];

                    if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                        if(sim[ni][nj].equals("")) {
                            board[bi][bj] = "";
                            board[ni][nj] = "BQ";

                            DFS(v+1, board, "w");

                            board[bi][bj] = "BQ";
                            board[ni][nj] = "";
                        }
                    }
                }

                for (int k = 0; k < 3; k++) {
                    int ni = bi + Rm4_1[k];
                    int nj = bj + Rm4_2[k];

                    if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                        if(sim[ni][nj].equals("")) {
                            board[bi][bj] = "";
                            board[ni][nj] = "BQ";

                            DFS(v+1, board, "w");

                            board[bi][bj] = "BQ";
                            board[ni][nj] = "";
                        }
                    }
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

                board[tempi][tempj] = str.toLowerCase() + " " + j;
            }


            DFS(0, board, "w");

            System.out.println(answer);
        }

    }
}
