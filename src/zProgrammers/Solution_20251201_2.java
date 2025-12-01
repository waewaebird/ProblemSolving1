package zProgrammers;

import java.time.LocalDateTime;

class Solution_20251201_2 {
    public String solution(int a, int b) {
        LocalDateTime dt = LocalDateTime.of(2016,a,b,0,0);
        return dt.getDayOfWeek().toString().substring(0,3);
    }
}