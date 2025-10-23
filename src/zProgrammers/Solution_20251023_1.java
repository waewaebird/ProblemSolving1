package zProgrammers;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution_20251023_1 {
    public int solution(String s) {
        int answer = 1;

        Deque<Character> stack = new ArrayDeque<>();

        for(char x: s.toCharArray()) {
            if(stack.size() == 0) {
                stack.push(x);
            } else {
                if(stack.peek() == x) {
                    stack.pop();
                } else {
                    stack.push(x);
                }
            }
        }

        if(stack.size() > 0) {
            answer = 0;
        }

        /*List<Integer> list = new ArrayList<>(); // 인덱스를 넣는것

        char[] arr = s.toCharArray();
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] != ' ') {
                list.add(i-1);
            }

            if (!list.isEmpty() && arr[list.get(list.size()-1)] != ' ') {
                if (arr[i] == arr[list.get(list.size()-1)]) {
                    arr[i] = ' ';
                    arr[list.get(list.size()-1)] = ' ';
                    list.remove(list.size()-1);
                }
            }
        }

        for(char x : arr) {
            if(Character.isAlphabetic(x)) {
                answer = 0;
                break;
            }
        }*/

        return answer;
    }

}