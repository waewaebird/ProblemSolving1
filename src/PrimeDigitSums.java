import java.math.BigDecimal;
import java.util.*;

public class PrimeDigitSums {
    public static int calSosu(int a, int b) {
        int count = 0;

        for (int i = a; i <= b; i++) {
            boolean flag = true;

            for (int j = 2; j < i ; j++) {
                if(i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if(flag) {
                count++;
            }
        }

        return count;
    }


    public static String solution(int n) {
        int three = 9; //100 ~ 999 = > 2 ~ 27
        int four = 11; //1000 ~ 9999 => 2 ~ 36
        int five = 14; //10000 ~ 99999 => 2 ~ 45


        // 999999 6=> 3 => 4
        // 999999 6=> 4 => 3
        // 999999 6=> 5 => 2

        // 9999999 7=> 3 => 5
        // 9999999 7=> 4 => 4
        // 9999999 7=> 5 => 3

        int sum = 0;

        for (int i = 3; i <= 5 ; i++) {
            int now = (n + 1) - i;

            if(i == 3) {
                sum += three * now;
            } else if(i == 4) {
                sum += four * now;
            } else if(i == 5) {
                sum += five * now;
            }
        }

        BigDecimal temp = new BigDecimal(String.valueOf(sum-2));
        //String answer = String.valueOf(temp.remainder(new BigDecimal("1000000007")));
        return String.valueOf(temp);
    }

    public static void main(String[] args) {
        List<String> answers = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            int n = in.nextInt();
            answers.add(solution(n));
        }

        for(String x : answers) {
            System.out.println(x);
        }


    }
}

