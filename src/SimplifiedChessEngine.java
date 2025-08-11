import java.util.Scanner;

public class SimplifiedChessEngine {
    // BLACK이 WHite Queen 잡는거 추가해야함
    // YES OR NO LOGIC 을 정해야함.
    // solution에서 sim배열 체크 다시하기
    static int[] Nm1 = {-2, -2, -1, -1,2,2,1,1};
    static int[] Nm2 = {-1,1,-2,2,1,-1,-2,2};
    static int[] Bm1_1 = {-1,-2,-3};
    static int[] Bm1_2 = {-1,-2,-3};

    static int[] Bm2_1 = {-1,-2,-3};
    static int[] Bm2_2 = {1,2,3};

    static int[] Bm3_1 = {1,2,3};
    static int[] Bm3_2 = {-1,-2,-3};

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

    public static void solution(int V, String nowHorse, String nowIndex, int I, int J, int[] moving1, int[] moving2, String[][] board, String[][] sim, String now) {
        if(answer.equals("YES")) {
            return;
        }

        if(now.equals("w")) {
            if (!nowHorse.equals("N")) {
                for (int k = 0; k < 3; k++) {
                    int ni = I + moving1[k];
                    int nj = J + moving2[k];

                    if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                        String[] tempArr = sim[ni][nj].split(" ");
                        if(tempArr[0].equals("q")) {
                            answer = "YES";
                            break;
                        } else {
                            if(Character.isLowerCase(tempArr[0].charAt(0))) {
                                break;
                            } else {
                                board[I][J] = "7 7";
                                board[ni][nj] = nowHorse + " " + nowIndex;

                                DFS(V+1, board, "b");

                                board[I][J] = nowHorse + " " + nowIndex;
                                board[ni][nj] = tempArr[0] + " " + tempArr[1];
                            }
                        }
                    }
                }
            } else {
                for (int k = 0; k < 8; k++) {
                    int ni = I + moving1[k];
                    int nj = J + moving2[k];

                    if (ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                        String[] tempArr = sim[ni][nj].split(" ");
                        if (tempArr[0].equals("q")) {
                            answer = "YES";
                            break;
                        } else {
                            if (Character.isUpperCase(tempArr[0].charAt(0))) {
                                break;
                            } else {
                                board[I][J] = "7 7";
                                board[ni][nj] = nowHorse + " " + nowIndex;

                                DFS(V + 1, board, "b");

                                board[I][J] = nowHorse + " " + nowIndex;
                                board[ni][nj] = tempArr[0] + " " + tempArr[1];
                            }
                        }
                    }
                }
            }
        } else {
            if(!nowHorse.equals("n")) {
                for (int k = 0; k < 3; k++) {
                    int ni = I + moving1[k];
                    int nj = J + moving2[k];

                    if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                        String[] tempArr = board[ni][nj].split(" ");
                        if(tempArr[0].equals("Q")) {
                            answer = "NO";
                            break;
                        } else {
                            if(Character.isLowerCase(tempArr[0].charAt(0))) {
                                break;
                            } else {
                                board[I][J] = "7 7";
                                board[ni][nj] = nowHorse + " " + nowIndex;

                                DFS(V+1, board, "w");

                                board[I][J] = nowHorse + " " + nowIndex;
                                board[ni][nj] = tempArr[0] + " " + tempArr[1];
                            }
                        }
                    }
                }
            } else {
                for (int k = 0; k < 8; k++) {
                    int ni = I + moving1[k];
                    int nj = J + moving2[k];

                    if (ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                        String[] tempArr = board[ni][nj].split(" ");
                        if (tempArr[0].equals("Q")) {
                            answer = "NO";
                            break;
                        } else {
                            if (Character.isLowerCase(tempArr[0].charAt(0))) {
                                break;
                            } else {
                                board[I][J] = "7 7";
                                board[ni][nj] = nowHorse + " " + nowIndex;

                                DFS(V + 1, board, "w");

                                board[I][J] = nowHorse + " " + nowIndex;
                                board[ni][nj] = tempArr[0] + " " + tempArr[1];
                            }
                        }
                    }
                }
            }
        }
    }

    public static void DFS(int v, String[][] board, String color) {
        if (answer.equals("YES")) {
            return;
        }

        if (v > move) {
            return;
        } else {
            if (color.equals("w")) {
                String[][] sim = simCheck(board, "w");

                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        if (!sim[i][j].equals("0 0") && !sim[i][j].equals("7 7") && !Character.isLowerCase(sim[i][j].split(" ")[0].charAt(0))) {
                            String nowHorse = board[i][j].split(" ")[0];
                            String nowIndex = board[i][j].split(" ")[1];

                            if (nowHorse.equals("Q")) {
                                solution(v, nowHorse, nowIndex, i, j, Bm1_1, Bm1_2, board, sim, "w");
                                solution(v, nowHorse, nowIndex, i, j, Bm2_1, Bm2_2, board, sim, "w");
                                solution(v, nowHorse, nowIndex, i, j, Bm3_1, Bm3_2, board, sim, "w");
                                solution(v, nowHorse, nowIndex, i, j, Bm4_1, Bm4_2, board, sim, "w");
                                solution(v, nowHorse, nowIndex, i, j, Rm1_1, Rm1_2, board, sim, "w");
                                solution(v, nowHorse, nowIndex, i, j, Rm2_1, Rm2_2, board, sim, "w");
                                solution(v, nowHorse, nowIndex, i, j, Rm3_1, Rm3_2, board, sim, "w");
                                solution(v, nowHorse, nowIndex, i, j, Rm4_1, Rm4_2, board, sim, "w");
                            } else if (nowHorse.equals("N")) {
                                solution(v, nowHorse, nowIndex, i, j, Nm1, Nm1, board, sim, "w");
                            } else if (nowHorse.split(" ")[0].equals("B")) {
                                solution(v, nowHorse, nowIndex, i, j, Bm1_1, Bm1_2, board, sim, "w");
                                solution(v, nowHorse, nowIndex, i, j, Bm2_1, Bm2_2, board, sim, "w");
                                solution(v, nowHorse, nowIndex, i, j, Bm3_1, Bm3_2, board, sim, "w");
                                solution(v, nowHorse, nowIndex, i, j, Bm4_1, Bm4_2, board, sim, "w");
                            } else if (nowHorse.split(" ")[0].equals("R")) {
                                solution(v, nowHorse, nowIndex, i, j, Rm1_1, Rm1_2, board, sim, "w");
                                solution(v, nowHorse, nowIndex, i, j, Rm2_1, Rm2_2, board, sim, "w");
                                solution(v, nowHorse, nowIndex, i, j, Rm3_1, Rm3_2, board, sim, "w");
                                solution(v, nowHorse, nowIndex, i, j, Rm4_1, Rm4_2, board, sim, "w");
                            }
                        }
                    }
                    if (answer.equals("YES")) {
                        break;
                    }
                }
            } else {
                String[][] sim = simCheck(board, "b");

                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        if (!sim[i][j].equals("0 0") && !sim[i][j].equals("7 7") && !Character.isUpperCase(sim[i][j].split(" ")[0].charAt(0))) {

                            String nowHorse = board[i][j].split(" ")[0];
                            String nowIndex = board[i][j].split(" ")[1];

                            if (nowHorse.equals("q")) {
                                solution(v, nowHorse, nowIndex, i, j, Bm1_1, Bm1_2, board, sim, "b");
                                solution(v, nowHorse, nowIndex, i, j, Bm2_1, Bm2_2, board, sim, "b");
                                solution(v, nowHorse, nowIndex, i, j, Bm3_1, Bm3_2, board, sim, "b");
                                solution(v, nowHorse, nowIndex, i, j, Bm4_1, Bm4_2, board, sim, "b");
                                solution(v, nowHorse, nowIndex, i, j, Rm1_1, Rm1_2, board, sim, "b");
                                solution(v, nowHorse, nowIndex, i, j, Rm2_1, Rm2_2, board, sim, "b");
                                solution(v, nowHorse, nowIndex, i, j, Rm3_1, Rm3_2, board, sim, "b");
                                solution(v, nowHorse, nowIndex, i, j, Rm4_1, Rm4_2, board, sim, "b");

                            } else if (nowHorse.equals("n")) {
                                solution(v, nowHorse, nowIndex, i, j, Nm1, Nm1, board, sim, "b");
                            } else if (nowHorse.split(" ")[0].equals("b")) {
                                solution(v, nowHorse, nowIndex, i, j, Bm1_1, Bm1_2, board, sim, "b");
                                solution(v, nowHorse, nowIndex, i, j, Bm2_1, Bm2_2, board, sim, "b");
                                solution(v, nowHorse, nowIndex, i, j, Bm3_1, Bm3_2, board, sim, "b");
                                solution(v, nowHorse, nowIndex, i, j, Bm4_1, Bm4_2, board, sim, "b");
                            } else if (nowHorse.split(" ")[0].equals("r")) {
                                solution(v, nowHorse, nowIndex, i, j, Rm1_1, Rm1_2, board, sim, "b");
                                solution(v, nowHorse, nowIndex, i, j, Rm2_1, Rm2_2, board, sim, "b");
                                solution(v, nowHorse, nowIndex, i, j, Rm3_1, Rm3_2, board, sim, "b");
                                solution(v, nowHorse, nowIndex, i, j, Rm4_1, Rm4_2, board, sim, "b");
                            }
                        }
                        if (answer.equals("YES")) {
                            break;
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
                    board[j][k] = "7 7";
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
                board[tempi][tempj] = str.toUpperCase() + " " + j;
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

    public static String[][] simCheck(String[][] board, String now) {
        String[][] sim = new String[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                sim[i][j] = board[i][j];
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(!sim[i][j].equals("7 7") && !sim[i][j].equals("0 0")) {
                    String nowHorse = sim[i][j].split(" ")[0];
                    String nowIndex = sim[i][j].split(" ")[1];
                    
                    if(now.equals("w") ? nowHorse.equals("q") : nowHorse.equals("Q")) {
                        for (int k = 0; k < 3; k++) {
                            int ni = i + Bm1_1[k];
                            int nj = j + Bm1_2[k];

                            if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                                if(sim[ni][nj].equals("7 7")) {
                                    sim[ni][nj] = "0 0";
                                } else {
                                    break;
                                }
                            }
                        }

                        for (int k = 0; k < 3; k++) {
                            int ni = i + Bm2_1[k];
                            int nj = j + Bm2_2[k];

                            if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                                if(sim[ni][nj].equals("7 7")) {
                                    sim[ni][nj] = "0 0";
                                } else {
                                    break;
                                }
                            }
                        }

                        for (int k = 0; k < 3; k++) {
                            int ni = i + Bm3_1[k];
                            int nj = j + Bm3_2[k];

                            if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                                if(sim[ni][nj].equals("7 7")) {
                                    sim[ni][nj] = "0 0";
                                } else {
                                    break;
                                }
                            }
                        }

                        for (int k = 0; k < 3; k++) {
                            int ni = i + Bm4_1[k];
                            int nj = j + Bm4_2[k];

                            if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                                if(sim[ni][nj].equals("7 7")) {
                                    sim[ni][nj] = "0 0";
                                } else {
                                    break;
                                }
                            }
                        }

                        for (int k = 0; k < 3; k++) {
                            int ni = i + Rm1_1[k];
                            int nj = j + Rm1_2[k];

                            if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                                if(sim[ni][nj].equals("7 7")) {
                                    sim[ni][nj] = "0 0";
                                } else {
                                    break;
                                }
                            }
                        }

                        for (int k = 0; k < 3; k++) {
                            int ni = i + Rm2_1[k];
                            int nj = j + Rm2_2[k];

                            if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                                if(sim[ni][nj].equals("7 7")) {
                                    sim[ni][nj] = "0 0";
                                } else {
                                    break;
                                }
                            }
                        }

                        for (int k = 0; k < 3; k++) {
                            int ni = i + Rm3_1[k];
                            int nj = j + Rm3_2[k];

                            if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                                if(sim[ni][nj].equals("7 7")) {
                                    sim[ni][nj] = "0 0";
                                } else {
                                    break;
                                }
                            }
                        }

                        for (int k = 0; k < 3; k++) {
                            int ni = i + Rm4_1[k];
                            int nj = j + Rm4_2[k];

                            if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                                if(sim[ni][nj].equals("7 7")) {
                                    sim[ni][nj] = "0 0";
                                } else {
                                    break;
                                }
                            }
                        }
                    } else if(now.equals("w") ? nowHorse.equals("n") : nowHorse.equals("N")) {
                        for (int k = 0; k < 8; k++) {
                            int ni = i + Nm1[k];
                            int nj = j + Nm2[k];

                            if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                                if(sim[ni][nj].equals("7 7")) {
                                    sim[ni][nj] = "0 0";
                                } else {
                                    break;
                                }
                            }
                        }
                    } else if(now.equals("w") ? nowHorse.equals("b") : nowHorse.equals("B")) {
                        for (int k = 0; k < 3; k++) {
                            int ni = i + Bm1_1[k];
                            int nj = j + Bm1_2[k];

                            if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                                if(sim[ni][nj].equals("7 7")) {
                                    sim[ni][nj] = "0 0";
                                } else {
                                    break;
                                }
                            }
                        }

                        for (int k = 0; k < 3; k++) {
                            int ni = i + Bm2_1[k];
                            int nj = j + Bm2_2[k];

                            if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                                if(sim[ni][nj].equals("7 7")) {
                                    sim[ni][nj] = "0 0";
                                } else {
                                    break;
                                }
                            }
                        }

                        for (int k = 0; k < 3; k++) {
                            int ni = i + Bm3_1[k];
                            int nj = j + Bm3_2[k];

                            if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                                if(sim[ni][nj].equals("7 7")) {
                                    sim[ni][nj] = "0 0";
                                } else {
                                    break;
                                }
                            }
                        }

                        for (int k = 0; k < 3; k++) {
                            int ni = i + Bm4_1[k];
                            int nj = j + Bm4_2[k];

                            if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                                if(sim[ni][nj].equals("7 7")) {
                                    sim[ni][nj] = "0 0";
                                } else {
                                    break;
                                }
                            }
                        }
                    } else if(now.equals("w") ? nowHorse.equals("r") : nowHorse.equals("R")) {
                        for (int k = 0; k < 3; k++) {
                            int ni = i + Rm1_1[k];
                            int nj = j + Rm1_2[k];

                            if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                                if(sim[ni][nj].equals("7 7")) {
                                    sim[ni][nj] = "0 0";
                                } else {
                                    break;
                                }
                            }
                        }

                        for (int k = 0; k < 3; k++) {
                            int ni = i + Rm2_1[k];
                            int nj = j + Rm2_2[k];

                            if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                                if(sim[ni][nj].equals("7 7")) {
                                    sim[ni][nj] = "0 0";
                                } else {
                                    break;
                                }
                            }
                        }

                        for (int k = 0; k < 3; k++) {
                            int ni = i + Rm3_1[k];
                            int nj = j + Rm3_2[k];

                            if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                                if(sim[ni][nj].equals("7 7")) {
                                    sim[ni][nj] = "0 0";
                                } else {
                                    break;
                                }
                            }
                        }

                        for (int k = 0; k < 3; k++) {
                            int ni = i + Rm4_1[k];
                            int nj = j + Rm4_2[k];

                            if(ni >= 0 && ni < 4 && nj >= 0 && nj < 4) {
                                if(sim[ni][nj].equals("7 7")) {
                                    sim[ni][nj] = "0 0";
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return sim;
    }
}
