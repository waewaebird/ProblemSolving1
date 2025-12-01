package zProgrammers._202511;

import java.util.Arrays;

class Solution_20251127_1 {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;

        int[] arr = {a,b,c,d};
        Arrays.sort(arr);



        if(a == b && b == c && c == d) {
            answer = 1111 * a;
        } else {
            int max = 0;
            int p = 0;
            int q = 0;
            int r = 0;

            for (int i = 0; i < 4; i++) {
                int cnt = 1;
                for (int j = i+1; j < 4; j++) {
                    if(arr[i] == arr[j]) {
                        cnt++;
                    }
                }

                if(cnt > max) {
                    p = arr[i];
                    max = cnt;
                }
            }


            if(max == 3) {
                for(int x : arr) {
                    if(x != p) {
                        q = x;
                        break;
                    }
                }
                answer = (10 * p + q) * (10 * p + q);
            } else if (max == 2) {
                for(int x : arr) {
                    if(x != p) {
                        if(q > 0) {
                            if(q != x) {
                                r =x;
                            }
                        } else {
                            q = x;
                        }
                    }
                }

                if(r > 0) {
                    answer = q*r;
                } else {
                    answer = (p + q) * Math.abs(p-q);
                }


            } else if (max == 1) {
                answer = arr[0];
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Solution_20251127_1 s = new Solution_20251127_1();
        System.out.println(s.solution(2,2,2,2));
        System.out.println(s.solution(4,1,4,4));
        System.out.println(s.solution(6,3,3,6));
        System.out.println(s.solution(2,5,2,6));
        System.out.println(s.solution(5,2,4,6));
    }
}