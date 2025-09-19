package zProgrammers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution_20250919_3 {
    static class Way {
        int[] from;
        int[] to;

        public Way(int[] from, int[] to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Way way = (Way) o;
            return (Arrays.equals(from, way.from) && Arrays.equals(to, way.to)) || (Arrays.equals(from, way.to) && Arrays.equals(to, way.from));
        }

        @Override
        public int hashCode() { // 빠르게 찾기 위한 주소번호를 만드는 메소드
            int result1 = Arrays.hashCode(from);
            int result2 = Arrays.hashCode(to);
            return result1 + result2;
        }
    }

    public int solution(String dirs) {
        int[][] maps = new int[11][11];

        Set<Way> sets = new HashSet<>();

        int nowi = 5;
        int nowj = 5;

        for(char x : dirs.toCharArray()) {
            int nexti = 0;
            int nextj = 0;

            if(x == 'U') {
                nexti = nowi - 1;
                nextj = nowj;
            } else if(x == 'D') {
                nexti = nowi + 1;
                nextj = nowj;
            } else if(x == 'R') {
                nexti = nowi;
                nextj = nowj + 1;
            } else if(x == 'L') {
                nexti = nowi;
                nextj = nowj - 1;
            }

            if(nexti >= 0 && nexti < 11 && nextj >= 0 && nextj < 11) {
                sets.add(new Way(new int[] {nowi,nowj}, new int[] {nexti,nextj}));

                nowi = nexti;
                nowj = nextj;

                maps[nowi][nowj]++;
            }
        }

        return sets.size();
    }
}