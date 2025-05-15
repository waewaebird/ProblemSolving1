package zHackerRank;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main_20250515_7 {
    //Day of the Programmer
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = in.nextInt();

        if(year <= 1917) {
            if(year % 4 == 0) {
                System.out.println("12.09." + year);
            } else {
                System.out.println("13.09." + year);
            }

        } else if(year == 1918) {
            System.out.println("26.09.1918");
        } else {
            LocalDate ofDate = LocalDate.of(year,1,1);
            LocalDate plusDate = ofDate.plusDays(255);
            System.out.println(plusDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
        }
    }
}
