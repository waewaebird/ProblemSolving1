package zProgrammers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution_20260319_1 {
    public int solution(int[][] signals) {
        int answer = -1;

        int min = Integer.MAX_VALUE;
        int sum = 0;
        Set<List<Integer>> sets = new HashSet<>();
        for(int[] temp : signals) {
            List<Integer> list = new ArrayList<>();
            list.add(temp[1]);
            list.add(temp[0] + temp[1]);
            list.add(temp[0] + temp[1] + temp[2]);

            sets.add(list);

            sum += temp[0] + temp[1] + temp[2];
        }

        for (int i = 2; i <= sum * 40000; i++) {
            int cnt = 0;

            for(List<Integer> temp : sets) {
                if(temp.get(0) == 1) {
                    if((i - temp.get(1)) % temp.get(2) == 0) {
                        cnt++;
                    } else {
                        break;
                    }
                } else {
                    int value = 0;
                    if(i - temp.get(1) < 1) {
                        value = temp.get(1);
                    } else {
                        value = ((((i - temp.get(1)) / temp.get(2)) + 1) * temp.get(2)) + temp.get(1);
                    }

                    if(i >= value - temp.get(0) + 1 && i <= value) {
                        cnt++;
                    } else {
                        break;
                    }
                }
            }

            if(cnt == sets.size()) {
                answer = i;
                break;
            }
        }

        return answer;
    }



    public static void main(String[] args) {
        Solution_20260319_1 s = new Solution_20260319_1();

        System.out.println(s.solution(new int[][] {{1, 18, 1}, {18, 1, 1}})); // 19



        System.out.println(s.solution(new int[][] {{1, 5, 1}, {1, 1, 1}})); // 2
        System.out.println(s.solution(new int[][] {{2, 1, 2}, {5, 1, 1}})); // 13
        System.out.println(s.solution(new int[][] {{2, 3, 2}, {3, 1, 3}, {2, 1, 1}})); // 11
        System.out.println(s.solution(new int[][] {{3, 3, 3}, {5, 4, 2}, {2, 1, 2}})); // 193


    }
}