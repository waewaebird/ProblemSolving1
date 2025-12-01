package zProgrammers._202511;

import java.util.ArrayDeque;
import java.util.Queue;

class Solution_20251120_1 {
    public int solution(String[] maps) {
        int answer = -1;

        int[] DI = {-1,0,0,1};
        int[] DJ = {0,-1,1,0};

        int I = maps.length;
        int J = maps[0].length();

        int[] ss = new int[2];
        int[] ls = new int[2];

        char[][] arr = new char[I][J];
        char[][] arr2 = new char[I][J];

        for (int i = 0; i < I; i++) {
            for (int j = 0; j < J; j++) {
                arr[i][j] = maps[i].charAt(j);
                arr2[i][j] = maps[i].charAt(j);
                if(arr[i][j] == 'S') {
                    ss[0] = i;
                    ss[1] = j;
                } else if(arr[i][j] == 'L') {
                    ls[0] = i;
                    ls[1] = j;
                }
            }
        }

        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(ss);

        int level = 0;
        int ln = 0;
        while(!queue.isEmpty()) {
            int len = queue.size();

            for (int i = 0; i < len; i++) {
                int[] current = queue.poll();

                for (int j = 0; j < 4; j++) {
                    int ni = current[0] + DI[j];
                    int nj = current[1] + DJ[j];

                    if(ni >= 0 && ni < I && nj >= 0 && nj < J) {
                        if(arr[ni][nj] != 'X') {
                             if(arr[ni][nj] == 'L') {
                                 ln = level+1;
                                 break;
                             }
                            arr[ni][nj] = 'X';
                            queue.offer(new int[] {ni,nj});
                        }
                    }
                }

                if(ln != 0) {
                    break;
                }
            }

            if(ln != 0) {
                break;
            }

            level++;
        }

        if(ln != 0) {
            queue.clear();
            queue.offer(ls);

            level = 0;
            while(!queue.isEmpty()) {
                int len = queue.size();

                for (int i = 0; i < len; i++) {
                    int[] current = queue.poll();

                    for (int j = 0; j < 4; j++) {
                        int ni = current[0] + DI[j];
                        int nj = current[1] + DJ[j];

                        if(ni >= 0 && ni < I && nj >= 0 && nj < J) {
                            if(arr2[ni][nj] != 'X') {
                                if(arr2[ni][nj] == 'E') {
                                    answer = level+1;
                                    break;
                                }

                                arr2[ni][nj] = 'X';
                                queue.offer(new int[] {ni,nj});
                            }
                        }
                    }

                    if(answer != -1) {
                        break;
                    }
                }

                if(answer != -1) {
                    break;
                }

                level++;
            }
        }

        if(answer == -1) {
            return answer;
        } else {
            return answer+ln;
        }
    }

    public static void main(String[] args) {
        Solution_20251120_1 s = new Solution_20251120_1();

        System.out.println(s.solution(new String[] {"OLOOO","XXXXS","OOOOO","OXXXX","OOOOE"}));
        //System.out.println(s.solution(new String[] {"SOOOL","XXXXO","OOOOO","OXXXX","OOOOE"}));
        //System.out.println(s.solution(new String[] {"LOOXS","OOOOX","OOOOO","OOOOO","EOOOO"}));


    }
}