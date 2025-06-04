package zHackerRank._202505;

import java.time.LocalDate;
import java.util.Scanner;

public class Main_20250522_3 {
    //Library Fine
    public static int solution(int d1, int m1, int y1, int d2, int m2, int y2) {
        LocalDate now = LocalDate.of(y1,m1,d1);
        LocalDate due = LocalDate.of(y2,m2,d2);

        if(now.isBefore(due)){
            return 0;
        }

        if(y1 > y2) {
            return 10000;
        } else if(m1 > m2) {
            return (m1 - m2) * 500;
        } else if(d1 > d2){
            return (d1 - d2) * 15;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();

        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();


        System.out.println(solution(d1,m1,y1,d2,m2,y2));
    }
}
