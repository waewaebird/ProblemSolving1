package zProgrammers;

import java.util.PriorityQueue;

class Solution_20250912_3 {
    static class Point implements Comparable<Point>{
        int value;
        int diff;

        public Point(int value, int diff) {
            this.value = value;
            this.diff = diff;
        }

        @Override
        public int compareTo(Point o) {
            if(this.diff == o.diff) {
                return Integer.compare(o.value, this.value);
            } else {
                return Integer.compare(this.diff, o.diff);
            }
        }
    }

    public int[] solution(int[] numlist, int n) {
        PriorityQueue<Point> pq = new PriorityQueue<>();

        for(int x : numlist) {
            int temp = Math.abs(n-x);
            pq.offer(new Point(x, temp));
        }

        int[] answer = new int[numlist.length];
        int i = 0;
        while(!pq.isEmpty()) {
            Point now = pq.poll();
            answer[i] = now.value;
            i++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution_20250912_3 s = new Solution_20250912_3();

        int[] numlist = {1, 2, 3, 4, 5, 6};
        int n = 4;

        s.solution(numlist,n);
    }
}