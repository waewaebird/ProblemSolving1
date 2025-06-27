import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class SaveHumanity {
    public static String solution(String p, String v) {
        List<Integer> answers = new ArrayList<>();

        StringBuilder sbs = new StringBuilder("");

        int move = v.length();

        char[] pArr = p.toCharArray();
        char[] vArr = v.toCharArray();

        int lt = 0;
        int rt = move;

        int count = 0;
        while(rt <= p.length()) {
            int cnt = 0;
            for (int i = 0; i < move; i++) {
                if(pArr[i+(count)] != vArr[i]) {
                    cnt++;
                    if(cnt > 1) {
                        break;
                    }
                }
            }

            if(cnt <= 1) {
                answers.add(lt);
                sbs.append(lt + " ");
            }

            lt++;
            rt++;
            count++;
        }

        if(sbs.length() > 1) {
            return sbs.toString();
        } else {
            return "No Match!";
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<String> answers = new ArrayList<>();

        int q = Integer.parseInt(br.readLine());

        for (int i = 0; i < q; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str1 = st.nextToken();
            String str2 = st.nextToken();

            answers.add(solution(str1, str2));
        }

        for(String x : answers) {
            System.out.println(x);
        }

    }
}
