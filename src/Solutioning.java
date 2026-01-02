import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solutioning {
    public String solution(int[] numbers) {
        String answer = "";

        List<String> list9 = new ArrayList<>();
        List<String> list8 = new ArrayList<>();
        List<String> list7 = new ArrayList<>();
        List<String> list6 = new ArrayList<>();
        List<String> list5 = new ArrayList<>();
        List<String> list4 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        List<String> list0 = new ArrayList<>();

        for (int x : numbers) {
            if(String.valueOf(x).charAt(0) == '9') {
                list9.add(String.valueOf(x));
            } else if (String.valueOf(x).charAt(0) == '8') {
                list8.add(String.valueOf(x));
            } else if (String.valueOf(x).charAt(0) == '7') {
                list7.add(String.valueOf(x));
            } else if (String.valueOf(x).charAt(0) == '6') {
                list6.add(String.valueOf(x));
            } else if (String.valueOf(x).charAt(0) == '5') {
                list5.add(String.valueOf(x));
            } else if (String.valueOf(x).charAt(0) == '4') {
                list4.add(String.valueOf(x));
            } else if (String.valueOf(x).charAt(0) == '3') {
                list3.add(String.valueOf(x));
            } else if (String.valueOf(x).charAt(0) == '2') {
                list2.add(String.valueOf(x));
            } else if (String.valueOf(x).charAt(0) == '1') {
                list1.add(String.valueOf(x));
            } else if (String.valueOf(x).charAt(0) == '0') {
                list0.add(String.valueOf(x));
            }
        }

        Map<Integer, List<String>> listMap = new HashMap<>();
        listMap.put(9, list9);
        listMap.put(8, list8);
        listMap.put(7, list7);
        listMap.put(6, list6);
        listMap.put(5, list5);
        listMap.put(4, list4);
        listMap.put(3, list3);
        listMap.put(2, list2);
        listMap.put(1, list1);

        for (int digit = 9; digit >= 1; digit--) {
            List<String> list = listMap.get(digit);

            if(!list.isEmpty()) {
                list.sort(null);
                int[] ch = new int[list.size()];

                int first = 0;
                for (int i = list.size()-1; i >= 0; i--) {
                    if(ch[i] != 0) {
                        continue;
                    }

                    int len = list.get(i).length();

                    if(len >= 2) {
                        boolean F = true;
                        for (int k = 1; k < list.get(i).length(); k++) {
                            if(Integer.valueOf(String.valueOf(list.get(i).charAt(k))) < digit) {
                                F = false;
                                break;
                            }
                        }
                        if(F) {
                            answer += list.get(i);
                            ch[i] = 1;
                            continue;
                        }
                    }

                    if(ch[first] == 0 && list.get(first).equals(String.valueOf(digit))) {
                        answer += list.get(first);
                        ch[first] = 1;
                        i++;
                        first++;
                        continue;
                    }

                    List<Integer> temps = new ArrayList<>();
                    for (int j = 0; j < i; j++) {
                        if(list.get(j).length() < len && ch[j] == 0) {
                            if(Integer.parseInt(list.get(j)) == Integer.parseInt(String.valueOf(list.get(i)).substring(0, list.get(j).length()))) {
                                temps.add(j);
                            }
                        }
                    }

                    if(temps.isEmpty()) {
                        answer += list.get(i);
                        ch[i] = 1;
                    } else {
                        if(Integer.valueOf(list.get(i).charAt(list.get(temps.get(0)).length())) > digit) {
                            answer += list.get(i);
                            ch[i] = 1;
                        } else {
                            answer += list.get(temps.get(temps.size()-1));
                            ch[temps.get(temps.size()-1)] = 1;
                            i++;
                        }
                    }
                }
            }
        }

        int zeroSize = list0.size();
        for (int i = 0; i < zeroSize; i++) {
            answer += '0';
        }

        return answer;
    }

    public static void main(String[] args) {
        Solutioning s = new Solutioning();

        //System.out.println(s.solution(new int[] {838,838971})); //838971838

        System.out.println(s.solution(new int[] {838,8381})); //8388381
                                                              // 8381838
        //System.out.println(s.solution(new int[] {99,98,999991 ,909,9})); // 99999999198909
        //System.out.println(s.solution(new int[] {0 , 10, 11, 11,0,9,13})); // 91311111000
        //System.out.println(s.solution(new int[] {6,7,444,410,420})); // 76444420410
        //System.out.println(s.solution(new int[] {8, 8, 810, 8199})); // 888199810
        //System.out.println(s.solution(new int[] {5,52,58,551,5512,5513,5514,541,5412,5413,5414}));
        //System.out.println(s.solution(new int[] {6,10,2})); // 6210
        //System.out.println(s.solution(new int[] {3, 30, 34, 5, 9})); // 9534330
    }
}