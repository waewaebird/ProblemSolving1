package zProgrammers;

import java.util.Arrays;

class Solution_20251121_1 {
    public static long calculate(int n, int[] times, long mid) {
        // mid가 들어왔을떄 그 숫자안에 몇명 넣을 수 있냐? 30
        long cnt = 0; //처리 숫자

        for (int ti = 0; ti < times.length; ti++) {
            if(ti > 0) {
                if((long) times[ti-1] * n < (long) times[ti]) {
                    break;
                }
            }
            cnt = cnt + (mid / (long) times[ti]);
        }

        return cnt;
    }

    public long solution(int n, int[] times) {
        long answer = Long.MAX_VALUE;

        Arrays.sort(times);

        long lt = (long) times[0];
        long rt = (long) times[times.length - 1] * (long) n;


        while(lt <= rt) {
            long mid = (lt+rt) / 2;

            long result = calculate(n, times, mid);
            if(result >= n) {
                rt = mid - 1;
                answer = Math.min(mid, answer);
            } else {
                lt = mid + 1;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Solution_20251121_1 s = new Solution_20251121_1();

        System.out.println(s.solution(1000000000, new int[] {1000000000}));
        //System.out.println(s.solution(6, new int[] {2,5}));
        //System.out.println(s.solution(6, new int[] {10,1}));
        //System.out.println(s.solution(21, new int[] {1,1,1,1,2,2}));
        //System.out.println(s.solution(120, new int[] {1, 60}));
        //System.out.println(s.solution(8, new int[] {1,5}));
    }
}