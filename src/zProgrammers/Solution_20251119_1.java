package zProgrammers;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

class Solution_20251119_1 {
    static class Room implements Comparable<Room> {
        LocalTime time;
        char word;

        public Room(String time, char word) {
            String[] times = time.split(":");

            if(word == 'b') {
                if(times[0].equals("23") && Integer.valueOf(times[1]) >= 50) {
                    this.time = LocalTime.of(23,59);
                    word = 'A';
                } else {
                    this.time = LocalTime.of(Integer.valueOf(times[0]), Integer.valueOf(times[1])).plusMinutes(10);
                }
            } else {
                this.time = LocalTime.of(Integer.valueOf(times[0]), Integer.valueOf(times[1]));
            }

            this.word = word;
        }

        @Override
        public int compareTo(Room o) {
            if(this.time.equals(o.time)) {
                return Integer.compare(o.word, this.word);
            } else {
                return this.time.compareTo(o.time);
            }
        }
    }

    public int solution(String[][] book_time) {
        int answer = 0;

        List<Room> list = new ArrayList<>();

        int len = book_time.length;
        for (int i = 0; i < len; i++) {
            list.add(new Room(book_time[i][0], 'a'));
            list.add(new Room(book_time[i][1], 'b'));
        }

        list.sort(null);
        int sum = 0;
        for(Room r : list) {
            if(r.word == 'a') {
                sum++;
            } else {
                sum--;
            }
            answer = Math.max(answer,sum);
        }

        return answer;
    }
}