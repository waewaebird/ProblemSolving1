import java.math.BigDecimal;
import java.util.*;

public class PrimeDigitSums {
    static Map<BigDecimal, Integer> sss = new HashMap<>();
    public static int calSosu(BigDecimal number) {
        if(sss.get(number) != null) {
            return sss.get(number);
        }

        int answer = 1;
        BigDecimal i = new BigDecimal(2);

        while(i.compareTo(number.divide(new BigDecimal(2)).add(BigDecimal.ONE)) < 0) {
            if(number.remainder(i) == BigDecimal.ZERO) {
                answer = -1;
                break;
            }
            i = i.add(BigDecimal.ONE);
        }

        sss.put(number, answer);
        return answer;
    }


    public static String solution(int n) {
        BigDecimal answer = BigDecimal.ZERO;


        StringBuilder mins = new StringBuilder("1");
        StringBuilder maxs = new StringBuilder("9");
        for (int i = 0; i < n-1; i++) {
            mins.append('0');
            maxs.append('9');
        }

        BigDecimal min = new BigDecimal(mins.toString());
        BigDecimal max = new BigDecimal(maxs.toString());

        sss.put(BigDecimal.ZERO, -1);
        sss.put(BigDecimal.ONE, -1);

        while(min.compareTo(max) < 0) {
            boolean br = false;

            String temp = String.valueOf(min);
            for (int length = 3; length <= 5 ; length++) {
                if(br) {
                    break;
                }

                BigDecimal sum = BigDecimal.ZERO;
                int lt = 0;
                for (int rt = 0; rt < temp.length(); rt++) {
                    sum = sum.add(new BigDecimal(Integer.parseInt(String.valueOf(temp.charAt(rt)))));

                    if(rt >= length-1) {
                        if(calSosu(sum) == -1) {
                            br = true;
                            break;
                        }
                        sum = sum.subtract(new BigDecimal(Integer.parseInt(String.valueOf(temp.charAt(lt)))));
                        lt++;
                    }
                }
            }

            if(!br) {
                answer = answer.add(BigDecimal.ONE);
            }
            min = min.add(BigDecimal.ONE);
        }

        BigDecimal d = new BigDecimal("1000000007");
        return String.valueOf(answer.remainder(d));
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
