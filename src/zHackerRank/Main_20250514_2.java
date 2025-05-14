package zHackerRank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main_20250514_2 {
    public static int solution(int[] nArr, int[] mArr) {
        int answer = 0;

        Map<Integer, Integer> maps = new HashMap<>();

        Arrays.sort(mArr);
        for(int x : mArr) {
            for (int i = 1; i <= x; i++) {
                if(x%i == 0) {
                    maps.put(i, maps.getOrDefault(i,0)+1);
                }
            }
        }

        for(Integer key : maps.keySet()) {
            if(maps.get(key) == mArr.length) {
                int tempCnt = 0;
                for(int x : nArr) {
                    if(key % x == 0 ) {
                        tempCnt++;
                    }
                }
                if(tempCnt == nArr.length) {
                    answer++;
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] nArr = new int[n];
        for (int i = 0; i < n; i++) {
            nArr[i] = in.nextInt();
        }

        int[] mArr = new int[m];
        for (int i = 0; i < m; i++) {
            mArr[i] = in.nextInt();
        }


        System.out.println(solution(nArr, mArr));

    }
}
