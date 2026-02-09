package zProgrammers._202601;

import java.util.ArrayList;
import java.util.List;

class Solution_20260115_1 {
    public Integer[] solution2(int[] numbers) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            int a = -1;
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[i] < numbers[j]) {
                    a = numbers[j];
                    break;
                }
            }
            list.add(a);
        }

        return list.toArray(new Integer[0]);
    }

    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        int max = 0;
        int supermax = 0;

        for (int i = numbers.length-1; i >= 0; i--) {
            if(i == numbers.length-1) {
                answer[i] = -1;
            } else {
                if(numbers[i] >= max) {
                    if(numbers[i] >= supermax) {
                        answer[i] = -1;
                    } else {
                        int a = -1;

                        for (int j = i+1; j < answer.length; j++) {
                            if(numbers[i] < answer[j]) {
                                a = answer[j];
                                break;
                            }
                        }
                        answer[i] = a;
                    }
                } else {
                    answer[i] = max;
                    if(i > 0) {
                        if(numbers[i] > numbers[i-1]) {
                            max = numbers[i];
                        }
                    }
                }
            }
            max = Math.max(max, numbers[i]);
            supermax = Math.max(supermax, numbers[i]);
        }

        return answer;
    }
}