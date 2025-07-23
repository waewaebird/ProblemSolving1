import java.util.*;

public class BiggerisGreater {

    public static String solution(String str) {
        Integer[] arr = new Integer[str.length()];

        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {

            arr[i] = (int) str.charAt(i);

            if(i > 0 && str.charAt(i) > str.charAt(i-1)) {
                cnt++;
            }
        }

        if(cnt == 0) {
            return "no answer";
        }


        int min = Integer.MAX_VALUE;
        int index = Integer.MIN_VALUE;

        int exchange = 0;
        for(int i = arr.length-1 ; i >= 0; i--) {
            if(index == Integer.MIN_VALUE && arr[i] < min) {
                min = arr[i];
                index = i;
            }

            if(min > arr[i]) {
                for (int j = index; j > i ; j--) {
                    arr[j] = arr[j-1];
                }
                arr[i] = min;
                exchange++;
            }

            if(exchange > 0) {
                break;
            }
        }

        String answer = "";
        for(int x : arr) {
            answer += (char) x;
        }

        return answer;
    }

    public static void main(String[] args) {
        List<String> answers = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            String str = in.next();

            answers.add(solution(str));
        }

        for(String answer : answers) {
            System.out.println(answer);
        }
    }
}
