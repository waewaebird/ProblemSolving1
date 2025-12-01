package zProgrammers._202511;

import java.util.Arrays;

class Solution_20251128_2 {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] memo = new int[31];

        int ms = 0;
        for(int x : lost) {
            for(int xx : reserve) {
                if(x == xx) {
                    memo[x] = 1;
                    ms++;
                }
            }
        }

        int number = n - lost.length + ms;

        int len = reserve.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        int[] ch = new int[len];

        for(int x : lost) {
            if(memo[x] == 1) {
                continue;
            }

            for (int index = 0; index < len; index++) {
                if(memo[reserve[index]] == 1) {
                    continue;
                }

                if(ch[index] == 0) {
                    if(Math.abs(x - reserve[index]) == 1) {
                        ch[index] = 1;
                        number++;
                        break;
                    }
                }
            }
        }

        return number;
    }

    public static void main(String[] args) {
        Solution_20251128_2 s = new Solution_20251128_2();

        System.out.println(s.solution(4, new int[] {2,3} , new int[] {3,4})); // 3
        System.out.println(s.solution(5, new int[] {2,4} , new int[] {1,3,5})); //5
        System.out.println(s.solution(5, new int[] {2,4} , new int[] {3})); //4
        System.out.println(s.solution(3, new int[] {3} , new int[] {1})); // 2
        System.out.println(s.solution(4, new int[] {1} , new int[] {1})); // 4
        System.out.println(s.solution(5, new int[] {1,2,3} , new int[] {4,5})); // 3
    }
}