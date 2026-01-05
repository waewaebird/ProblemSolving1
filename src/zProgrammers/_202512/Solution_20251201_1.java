package zProgrammers._202512;

class Solution_20251201_1 {
    public int solution(int[][] sizes) {
        int answer = 0;

        int max0 = 0;
        int max1 = 0;

        for (int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] >= sizes[i][1]) {
                max0 = Math.max(max0, sizes[i][0]);
                max1 = Math.max(max1, sizes[i][1]);
            } else {
                max0 = Math.max(max0, sizes[i][1]);
                max1 = Math.max(max1, sizes[i][0]);
            }
        }

        return max0 * max1;
    }
}

