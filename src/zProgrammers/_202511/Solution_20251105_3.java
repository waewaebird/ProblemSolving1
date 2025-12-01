package zProgrammers._202511;

import java.util.ArrayList;
import java.util.List;

class Solution_20251105_3 {
    static class Distance implements Comparable<Distance> {
        int start;
        int end;

        public Distance(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Distance o) {
            if(this.start == o.start) {
                return Integer.compare(this.end, o.end);
            } else {
                return Integer.compare(this.start, o.start);
            }
        }
    }


    public int solution(int[][] routes) {
        List<Distance> list = new ArrayList<>();

        for (int i = 0; i < routes.length; i++) {
            list.add(new Distance(routes[i][0], routes[i][1]));
        }

        int answer = 0;
        list.sort(null);

        int startPoint = list.get(0).start;
        int endPoint = list.get(0).end;
        answer++;

        for (int i = 1; i < list.size(); i++) {
            if(endPoint >= list.get(i).start) {
                endPoint = Math.min(endPoint, list.get(i).end);
            } else {
                startPoint = list.get(i).start;
                endPoint = list.get(i).end;
                answer++;

            }

        }

        return answer;
    }

}



