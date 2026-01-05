package zProgrammers._202512;

import java.util.HashMap;
import java.util.Map;

class Solution_20251212_1 {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;

        Map<String, Integer> zMap = new HashMap<>();
        for(String x : friends) {
            zMap.put(x, 0);
        }

        Map<String, Integer> rMap = new HashMap<>();
        for(String x : gifts) {
            String s1 = x.split(" ")[0];
            String s2 = x.split(" ")[1];

            zMap.put(s1, zMap.get(s1) + 1);
            zMap.put(s2, zMap.get(s2) - 1);

            rMap.put(x, rMap.getOrDefault(x,0) + 1);
        }

        for(String hero : friends) {
            int herotemp = 0;
            for(String h : friends) {
                if(!hero.equals(h)) {

                    int zugobatgo = 0;


                    for(Map.Entry<String, Integer> entry : rMap.entrySet()) {
                        String key1 = entry.getKey().split(" ")[0];
                        String key2 = entry.getKey().split(" ")[1];

                        if(hero.equals(key1) && h.equals(key2)) {
                            zugobatgo += entry.getValue();
                        }

                        if(hero.equals(key2) && h.equals(key1)) {
                            zugobatgo -= entry.getValue();
                        }
                    }

                    if(zugobatgo > 0) {
                        herotemp++;
                    } else if(zugobatgo == 0) {
                        if(zMap.get(hero) > zMap.get(h)) {
                            herotemp++;
                        }
                    }
                }
            }
            answer = Math.max(answer, herotemp);
        }

        return answer;
    }


    public static void main(String[] args) {
        Solution_20251212_1 s = new Solution_20251212_1();
        System.out.println(s.solution(new String[] {"muzi", "ryan", "frodo", "neo"}, new String[] {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"})); // 2
        System.out.println(s.solution(new String[] {"joy", "brad", "alessandro", "conan", "david"}, new String[] {"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"})); // 4
        System.out.println(s.solution(new String[] {"a", "b", "c"}, new String[] {"a b", "b a", "c a", "a c", "a c", "c a"})); // 0
    }
}