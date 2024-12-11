package Array;

import java.util.*;

public class Main11 {
    /*public static int solution2(int n,  int[][] arr) {
        int answer = 0, max = 0;
        for(int i =1 ; i<=n ; i++) {
            int cnt = 0;
            for(int j = 1 ; j<=n ; j++) {
                for(int k = 1 ; k <= 5 ; k++) {
                    if(arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt > max) {
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }*/


    public static int solution(int n,  int[][] arr) {
        int answer = 0;
        Map<Integer, Integer> am = new HashMap<>();

        for(int i = 0 ; i < 5 ; i++) {
            List<Integer> temp = new ArrayList<>();
            for(int j = 0 ; j < n ; j++) {
                temp.add(arr[j][i]);
            }
            for(Integer nnn : temp){
                if(Collections.frequency(temp, nnn) > 1) {
                    for (int ii = 0; ii < temp.size(); ii++) {
                        if (Objects.equals(temp.get(ii), nnn)) {
                            if(am.get(ii+1) == null || am.get(ii+1) == 0) {
                                am.put(ii+1, 1);
                            } else {
                                am.put(ii+1,am.get(ii+1)+1);
                            }
                        }
                    }
                }
            }
        }

        Integer maxV = Collections.max(am.values());
        for(Integer key : am.keySet()) {
            if(am.get(key) == maxV) {
                answer = key;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        //int[][] arr = new int[n][5];
        int[][] arr = new int[n+1][6];

        for(int i = 1 ; i <= n ; i++) {
            for(int j = 1 ; j <= 5 ; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(solution(n, arr));
    }
}

/*
5
9 8 7 6 5
5 6 7 8 9
1 2 3 7 8
4 5 3 4 2
6 2 8 4 2


3 5
1 2 3 4
4 5
4 5


5
9 8 7 6 5
5 6 7 8 9
1 2 3 7 8
4 5 3 4 2
6 2 8 4 2

0




 */

