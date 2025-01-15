package HashMapTreeSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main4 {
    public static int solution2(String a, String b){
        int answer = 0;
        Map<Character, Integer> am = new HashMap<>();
        Map<Character, Integer> bm = new HashMap<>();

        for(char x : b.toCharArray()) {
            bm.put(x, bm.getOrDefault(x, 0) + 1);
        }

        int L = b.length() - 1; //2까지
        for (int i = 0; i < L; i++) {
            am.put(a.charAt(i) , am.getOrDefault(a.charAt(i),0) + 1);
        }

        int lt = 0;
        for (int rt = L; rt < a.length(); rt++) {
            am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0) + 1);
            if(am.equals(bm)) {
                answer++;
            }
            am.put(a.charAt(lt), am.get(a.charAt(lt) -1));
            if(am.get(a.charAt(lt)) ==0) {
                am.remove(a.charAt(lt));
            }
            lt++;
        }

        return answer;
    }

    public static int solution(String s, String t){
        int answer = 0;

        Map<Character, Integer> tMap = new HashMap<>();
        for(char x : t.toCharArray()) {
            tMap.put(x, tMap.getOrDefault(x, 0) + 1);
        }

        // t.length();로 비교
        int cnt = 0;

        Map<Character, Integer> temp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {

            boolean flag = true;
            cnt++;
            temp.put(s.charAt(i), temp.getOrDefault(s.charAt(i), 0) + 1);
            if(cnt == t.length()) {
                for(char key : tMap.keySet()) {
                    if(tMap.get(key) != temp.get(key)) {
                        flag = false;
                        break;
                    }
                }

                if(flag == true) {
                    answer++;
                }

                temp.put(s.charAt(i-t.length()+1) , temp.get(s.charAt(i-t.length()+1)) -1);
                if(temp.get(s.charAt(i-t.length()+1)) == 0) {
                    temp.remove(s.charAt(i-t.length()+1));
                }
                cnt--;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.next();
        String t = in.next();

        System.out.println(solution(s,t));
    }
}
