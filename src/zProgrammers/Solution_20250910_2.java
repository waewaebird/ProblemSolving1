package zProgrammers;

class Solution_20250910_2 {
    // 정수를 나선형으로 배치하기
    static int lt = 0;
    static int rt = 0;
    static char flag = 'a';

    public static void calculate(){
        if(flag == 'a') {
            rt++;
        } else if(flag == 'b') {
            lt++;
        } else if(flag == 'c') {
            rt--;
        } else if(flag == 'd') {
            lt--;
        }
    }

    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        int imax = n-1;
        int imin = 0;

        int jmax = n-1;
        int jmin = 0;


        for (int i = 1; i <= n*n; i++) {
            answer[lt][rt] = i;

            if(lt == imin && rt == imax) {
                flag = 'b';
            } else if(lt == imax && rt == jmax){
                flag = 'c';
            } else if(lt == imax && rt == jmin) {
                flag = 'd';
                imin++;
            } else if(lt == imin && rt == jmin) {
                if(!(lt == rt)) {
                    jmin++;
                    imax--;
                    jmax--;
                }

                flag = 'a';
            }

            calculate();
        }

        return answer;
    }
}