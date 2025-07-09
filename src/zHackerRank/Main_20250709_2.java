package zHackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_20250709_2 {
    // Luck Balance
    static class Contest implements Comparable<Contest> {
        int L;
        int T;

        public Contest(int l, int t) {
            L = l;
            T = t;
        }

        @Override
        public int compareTo(Contest o) {
            if(this.T == o.T) {
                return Integer.compare(this.L, o.L);
            } else {
                return Integer.compare(this.T, o.T);
            }
        }
    }

    public static Integer solution(int n, int k, List<Contest> list) {
        list.sort(null);

        int maxSum = 0;
        int cnt = 0;

        for(Contest c : list) {
            if(c.T == 1) {
                cnt++;
            }
        }

        int minusSum = 0;
        for(Contest c : list) {
            //System.out.println(c.L + " " + c.T);
            if(c.T == 0) {
                maxSum += c.L;
            } else {
                if(cnt > k) {
                    minusSum += c.L;
                    cnt--;
                } else {
                    maxSum += c.L;
                }
            }
        }

        return maxSum-minusSum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        List<Contest> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            list.add(new Contest(a,b));
        }

        System.out.println(solution(n,k,list));
    }
}
