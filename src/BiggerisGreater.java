import java.util.*;

public class BiggerisGreater {

    public static String solution(String str) {
        List<Integer> list = new ArrayList<>();

        for(char x : str.toCharArray()) {
            list.add((int) x);
        }

        System.out.println(list);

        return null;
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
